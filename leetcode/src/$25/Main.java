package $25;

import java.util.LinkedList;
import java.util.StringJoiner;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/4 10:41
 * @desc: 25. K 个一组翻转链表
 * <p>
 * 给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 * <p>
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[2,1,4,3,5]
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
            ListNode cur = this;
            final StringJoiner joiner = new StringJoiner("->");
            while (cur != null) {
                joiner.add(String.valueOf(cur.val));
                cur = cur.next;
            }
            return joiner.toString();
        }
    }

    public static void main(String[] args) {
        final ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        System.out.println("new Main().reverseKGroup(listNode,2) = " + new Main().reverseKGroup(listNode, 2));
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        final LinkedList<ListNode> list = new LinkedList<>();

        final ListNode res = new ListNode();
        ListNode current = res;

        for (ListNode cur = head; cur != null; ) {
            list.offerLast(cur);
            ListNode next = cur.next;
            if (list.size() == k) {
                while (!list.isEmpty()) {
                    final ListNode pop = list.pollLast();
                    pop.next = null;
                    current.next = pop;
                    current = current.next;
                }
                cur = next;
            } else {
                cur = cur.next;
            }
        }
        if (!list.isEmpty()) {
            current.next = list.pollFirst();
        }
        return res.next;
    }

}