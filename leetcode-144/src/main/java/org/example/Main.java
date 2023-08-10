package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/10 16:15
 * @desc: 144. 二叉树的前序遍历
 * <p>
 * 输入：root = [1,null,2,3]
 * 输出：[1,2,3]
 **/
public class Main {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        final TreeNode treeNode = new TreeNode(1, null, null);
        treeNode.right = new TreeNode(2, new TreeNode(3), null);
        System.out.println("new Main().preorderTraversal(treeNode) = " + new Main().preorderTraversal(treeNode));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        final ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }

}