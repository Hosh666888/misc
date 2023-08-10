import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringJoiner;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/2 15:58
 * @desc: 19. 删除链表的倒数第 N 个结点
 * <p>
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 **/
public class Main {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            ListNode cursor = this;
            final StringJoiner sb = new StringJoiner("->");
            while (cursor != null) {
                sb.add(String.valueOf(cursor.val));
                cursor = cursor.next;
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        final ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        // listNode.next.next = new ListNode(3);
        // listNode.next.next.next = new ListNode(4);
        // listNode.next.next.next.next = new ListNode(5);

        System.out.println("new Main().removeNthFromEnd(listNode,2) = " + new Main().removeNthFromEnd(listNode, 1));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        final LimitedQueue queue = new LimitedQueue(n);

        ListNode cursor = head;

        while (cursor != null) {
            queue.offerLast(cursor);
            cursor = cursor.next;
        }
        return queue.get();
    }

    static class LimitedQueue extends ArrayDeque<ListNode> {
        private final int maxLength;
        private final ListNode res;
        private ListNode cursor;

        public LimitedQueue(int count) {
            maxLength = count;
            res = new ListNode();
            cursor = res;
        }

        @Override
        public boolean offerLast(ListNode listNode) {
            final boolean b = super.offerLast(listNode);
            if (size() > maxLength) {
                cursor.next = super.pollFirst();
                cursor = cursor.next;
            }
            return b;
        }

        public ListNode get() {
            //弹出第一个
            pollFirst();

            //连接上后面的东西
            while (!super.isEmpty()) {
                cursor.next = pollFirst();
                cursor = cursor.next;
            }
            cursor.next = null;

            return res.next;
        }

    }

}