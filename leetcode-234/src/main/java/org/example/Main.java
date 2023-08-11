package org.example;

import java.util.Stack;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/11 16:06
 * @desc: 234. 回文链表
 * <p>
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
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
    }

    public static void main(String[] args) {
        final ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);

        System.out.println("new Main().isPalindrome(listNode) = " + new Main().isPalindrome(listNode));

        final ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        System.out.println("new Main().isPalindrome(listNode1) = " + new Main().isPalindrome(listNode1));

    }

    public boolean isPalindrome(ListNode head) {
        final Stack<Integer> stack = new Stack<>();
        //计算总长度
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        boolean ifEven = length % 2 == 0;
        int mid = length / 2;

        cur = head;
        while (cur != null && mid > 0) {
            stack.push(cur.val);
            cur = cur.next;
            mid--;
        }

        if (!ifEven) {
            cur = cur.next;
        }

        while (cur != null) {
            if (cur.val != stack.pop())
                return false;
            cur = cur.next;
        }

        return true;
    }

}