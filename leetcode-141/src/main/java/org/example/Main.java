package org.example;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/10 16:06
 * /**
 * @desc: 141. 环形链表
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 **/
public class Main {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        final ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;

        listNode2.next = new ListNode(0);
        listNode2.next.next = new ListNode(-4);
        listNode2.next.next.next = listNode2;

        System.out.println("new Main().hasCycle(listNode) = " + new Main().hasCycle(listNode));

    }

    public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        int revert = (int) (Math.pow(10, 5) + 1);

        while (cur != null) {
            if (cur.val == revert) {
                return true;
            }
            cur.val = revert;
            cur = cur.next;
        }
        return false;
    }

}