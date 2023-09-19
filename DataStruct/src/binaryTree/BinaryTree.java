package binaryTree;

import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/19 9:22
 * @desc:
 **/
public class BinaryTree<T> {
    private TreeNode<T> root;

    public static <T> BinaryTree<T> Build(List<T> list) {
        final BinaryTree<T> tree = new BinaryTree<>();
        if (list == null || list.isEmpty()) return tree;

        tree.root = new TreeNode<>();
        TreeNode<T> cursor = tree.root;

        for (int i = 0; i < list.size(); i++) {
            T data = list.get(i);
            cursor.setData(data);

            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;

            if (leftIndex < list.size()) {
                final TreeNode<T> l = new TreeNode<>();
                l.setData(list.get(leftIndex));
                cursor.setLeft(l);
            }

            if (rightIndex < list.size()) {
                final TreeNode<T> r = new TreeNode<>();
                r.setData(list.get(leftIndex));
                cursor.setLeft(r);
            }


        }


        return tree;
    }


}
