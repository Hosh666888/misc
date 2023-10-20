package $0_200.$0_30.$8;

import java.util.Stack;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/31 9:32
 * @desc: 字符串转换整数 (atoi)
 * 读入字符串并丢弃无用的前导空格
 * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
 * 返回整数作为最终结果。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/string-to-integer-atoi
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 输入：s = "   -42"
 * 输出：-42
 * 解释：
 * 第 1 步："   -42"（读入前导空格，但忽视掉）
 * ^
 * 第 2 步："   -42"（读入 '-' 字符，所以结果应该是负数）
 * ^
 * 第 3 步："   -42"（读入 "42"）
 * ^
 * 解析得到整数 -42 。
 * 由于 "-42" 在范围 [-231, 231 - 1] 内，最终结果为 -42 。
 * 示例 3：
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/string-to-integer-atoi
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new $8.Main().myAtoi(\"\") = " + new Main().myAtoi("   +0 123"));
    }

    public int myAtoi(String s) {
        int positive = 1;
        boolean flag = false;
        long sum = 0;
        s = s.trim();
        final char[] charArray = s.toCharArray();
        final Stack<Character> stack = new Stack<>();

        // if ()

        for (char c : charArray) {
            if ('+' == c || '-' == c) {
                if (flag || !stack.isEmpty()) break;
                positive = c == '+' ? 1 : -1;
                flag = true;
                continue;
            }

            if (c >= '0' && c <= '9') {
                stack.push(c);
            } else {
                break;
            }

        }


        int pow = 0;
        while (!stack.isEmpty()) {
            sum += Math.pow(10, pow++) * Integer.parseInt(stack.pop().toString());
        }

        sum *= positive;

        return (int) (positive == -1 ? Math.max(Integer.MIN_VALUE, sum) : Math.min(Integer.MAX_VALUE, sum));
    }

}