package $0_200.$91_120.$101;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/1 17:00
 * @desc: 101. 对称二叉树
 * <p>
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * <p>
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * <p>
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 **/
public class Main {
    public static class TreeNode {
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
        System.out.println("Hello world!");
    }

    public boolean isSymmetric(TreeNode root) {

        if (root != null) {

            final TreeNode left = root.left;
            final TreeNode right = root.right;

            if (left == null && right == null) return true;

            if (left == null || right == null || left.val != right.val) {
                return false;
            }

            return isSymmetric(left) && isSymmetric(right);

        }

        return true;


    }

}