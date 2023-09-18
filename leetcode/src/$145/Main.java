package $145;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/10 16:19
 * @desc: 145. 二叉树的后序遍历
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
        System.out.println("new Main().postorderTraversal(treeNode) = " + new Main().postorderTraversal(treeNode));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        final ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.addAll(postorderTraversal(root.left));
            list.addAll(postorderTraversal(root.right));
            list.add(root.val);
        }
        return list;
    }
}