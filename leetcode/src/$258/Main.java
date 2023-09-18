package $258;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/11 16:34
 * @desc: 258. 各位相加
 * <p>
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 * <p>
 * 输入: num = 38
 * 输出: 2
 * 解释: 各位相加的过程为：
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2
 * 由于 2 是一位数，所以返回 2。
 * <p>
 * 输入: num = 0
 * 输出: 0
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().addDigits(38) = " + new Main().addDigits(38));
        System.out.println("new Main().addDigits(0) = " + new Main().addDigits(0));
    }

    public int addDigits(int num) {
        while (num >= 10) {
            int res = 0;
            while (num > 0) {
                res += num % 10;
                num = num / 10;
            }
            num = res;
        }
        return num;
    }

}