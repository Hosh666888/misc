import java.util.ArrayList;
import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/1 17:38
 * @desc: 119. 杨辉三角 II
 * <p>
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * <p>
 * 输入: rowIndex = 3
 * 输出: [1,3,3,1]
 * <p>
 * 输入: rowIndex = 0
 * 输出: [1]
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().getRow(3) = " + new Main().getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {


        final ArrayList<Integer> last = new ArrayList<>();

        for (int i = 0; i < rowIndex; i++) {


        }

        return null;
    }
}