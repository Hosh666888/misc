import java.util.StringJoiner;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/31 14:28
 * @desc: 2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
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

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            final StringJoiner joiner = new StringJoiner("->");
            ListNode temp = this;
            while (temp != null) {
                joiner.add(String.valueOf(temp.val));
                temp = temp.next;
            }
            return joiner.toString();
        }
    }


    public static void main(String[] args) {
        final ListNode listNode13 = new ListNode(3);
        final ListNode listNode12 = new ListNode(4, listNode13);
        final ListNode listNode1 = new ListNode(2, listNode12);

        System.out.println("listNode1 = " + listNode1);


        final ListNode listNode23 = new ListNode(4);
        final ListNode listNode22 = new ListNode(6, listNode23);
        final ListNode listNode2 = new ListNode(5, listNode22);

        System.out.println("listNode2 = " + listNode2);
        System.out.println("new Main().addTwoNumbers(listNode1, listNode2) = " + new Main().addTwoNumbers(listNode1, listNode2));
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode head = new ListNode();
        ListNode cursor = head;
        int jump = 0;
        while (l1 != null || l2 != null || jump != 0) {
            int a = 0, b = 0;
            if (l1 != null)
                a = l1.val;
            if (l2 != null)
                b = l2.val;
            int sum = a + b + jump;
            jump = sum > 9 ? 1 : 0;

            cursor.next = new ListNode(sum % 10);
            cursor = cursor.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

        }

        return head.next;
    }
}