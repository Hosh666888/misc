package $65;

import $125.Main;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/18 14:17
 * @desc: 65. 有效数字
 * 有效数字（按顺序）可以分成以下几个部分：
 * <p>
 * 一个 小数 或者 整数
 * （可选）一个 'e' 或 'E' ，后面跟着一个 整数
 * 小数（按顺序）可以分成以下几个部分：
 * <p>
 * （可选）一个符号字符（'+' 或 '-'）
 * 下述格式之一：
 * 至少一位数字，后面跟着一个点 '.'
 * 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
 * 一个点 '.' ，后面跟着至少一位数字
 * 整数（按顺序）可以分成以下几个部分：
 * <p>
 * （可选）一个符号字符（'+' 或 '-'）
 * 至少一位数字
 * 部分有效数字列举如下：["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"]
 * <p>
 * 部分无效数字列举如下：["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"]
 * <p>
 * 给你一个字符串 s ，如果 s 是一个 有效数字 ，请返回 true 。
 * <p>
 * 输入：s = "e"
 * 输出：false
 **/
public class Solution {
    public static void main(String[] args) {
        System.out.println("new Main().isPalindrome(\"0\") = " + new Main().isPalindrome("0"));
        System.out.println("new Solution().isNumber(\"e\") = " + new Solution().isNumber("e"));
    }

    public boolean isNumber1(String s) {
        s = Optional.ofNullable(s).orElse("").trim();
        if (s.isEmpty()) return false;

        boolean pointFlag = false;
        boolean eFlag = false;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == '.') {
                if (pointFlag || eFlag)
                    return false;
                pointFlag = true;
                if (i == s.length() - 1 || !Character.isDigit(s.charAt(i + 1))) return false;
            }

            if (Character.isAlphabetic(temp)) {
                if (temp != 'e' && temp != 'E') return false;

                if (eFlag)
                    return false;
                eFlag = true;
                //检查e后面有没有点
                for (int j = i + 1; j < s.length() - 1; j++) {
                    final char c = s.charAt(j);
                    if ((c == '+' || c == '-') && j != i + 1)
                        return false;
                    if (c == '.') return false;

                }
            }

        }
        return true;
    }

    public boolean isNumber(String s) {
        final Pattern compile = Pattern.compile("[+-]?\\d*(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
        final Matcher matcher = compile.matcher(s);
        return matcher.find();
    }
}
