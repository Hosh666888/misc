package $201_400.$206;

import java.util.Stack;
import java.util.StringJoiner;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/2 16:28
 * @desc: 206. 反转链表
 * <p>
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 **/
public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
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
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        System.out.println("new Main().removeNthFromEnd(listNode,2) = " + new Main().reverseList(listNode));
    }

    public ListNode reverseList(ListNode head) {
        final Stack<ListNode> stack = new Stack<>();
        ListNode cursor = head;
        while (cursor != null) {
            stack.push(cursor);
            cursor = cursor.next;
        }
        final ListNode res = new ListNode();
        cursor = res;
        while (!stack.isEmpty()) {
            cursor.next = stack.pop();
            cursor = cursor.next;
        }
        cursor.next = null;
        return res.next;
    }
}