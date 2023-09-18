package $671;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Double.J
 * @create 2021/7/27 16:40
 * @e-mail zjj20001031@foxmail.com/gugezhang872@gmail.com
 */
public class Solution {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2, new TreeNode(2), new TreeNode(2));
        findSecondMinimumValue(treeNode);
    }
    public static int findSecondMinimumValue(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        TreeNode temp = root;
        while (temp.left.left!=null){

            list.add(temp.val);

            temp = temp.left.val<temp.right.val?temp.left:temp.right;

        }

        Collections.sort(list);

        if (list.size()<2){
            return -1;
        }

        return list.get(1);

    }
}
