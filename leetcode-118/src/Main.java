import java.util.ArrayList;
import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/1 17:26
 * @desc: 118. 杨辉三角
 * <p>
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * <p>
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * 输入: numRows = 1
 * 输出: [[1]]
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().generate(5) = " + new Main().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        final ArrayList<List<Integer>> res = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {

            final ArrayList<Integer> row = new ArrayList<>(i + 1);
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    final List<Integer> lastRow = res.get(i - 1);
                    row.add(lastRow.get(j - 1) + lastRow.get(j));
                }
            }
            res.add(row);
        }
        return res;
    }


}