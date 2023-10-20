package $0_200.$61_90.$83;

import java.util.StringJoiner;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/31 17:30
 * @desc: 83. 删除排序链表中的重复元素
 * <p>
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 * <p>
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：head = [1,1,2,3,3]
 * 输出：[1,2,3]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 链表中节点数目在范围 [0, 300] 内
 * -100 <= Node.val <= 100
 * 题目数据保证链表已经按升序排列
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
            ListNode temp = this;
            StringJoiner sb = new StringJoiner("->");
            while (temp != null) {
                sb.add(String.valueOf(temp.val));
                temp = temp.next;
            }
            return sb.toString();
        }


    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        System.out.println("new $83.Main().deleteDuplicates(head) = " + new Main().deleteDuplicates(head));

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode cursor = head;
        while (cursor != null) {
            final int current = cursor.val;

            ListNode temp = cursor.next;
            while (temp != null) {
                if (temp.val != current) {
                    break;
                }
                temp = temp.next;
            }
            cursor.next = temp;
            cursor = cursor.next;
        }

        return head;
    }
}