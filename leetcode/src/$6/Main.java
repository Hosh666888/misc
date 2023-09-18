package $6;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/27 16:42
 * @desc:6. N 字形变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().convert("AB", 1));

    }


    public String convert(String s, int numRows) {

        int seed = 2 * numRows + (numRows - 2);
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }

        int now = 0;
        boolean plus = true;
        for (int i = 0; i < s.length(); i++) {

            int mod = now % seed;

            if (mod == 0 || mod == seed - numRows) {
                plus = true;
            } else if (mod == numRows - 1 || mod == seed - 1) {
                plus = false;
            }

            sbs[now].append(s.charAt(i));

            now = plus ? Math.min(now + 1, numRows - 1) : Math.max(now - 1, 0);


        }
        final StringBuilder res = new StringBuilder();
        for (StringBuilder sb : sbs) {
            res.append(sb);
        }
        return res.toString();
    }
}