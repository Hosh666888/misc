package $201_400.$203;

import java.util.StringJoiner;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/10 17:09
 * @desc: 203. 移除链表元素
 * <p>
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 **/
public class Main {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            final StringJoiner joiner = new StringJoiner("->");
            ListNode cur = this;
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
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(6);

        System.out.println("new Main().removeElements(listNode,6) = " + new Main().removeElements(listNode, 6));
    }

    public ListNode removeElements(ListNode head, int val) {
        return null;
    }
}