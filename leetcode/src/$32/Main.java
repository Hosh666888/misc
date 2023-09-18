package $32;

import java.util.Stack;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/7 16:05
 * @desc: 32. 最长有效括号
 * <p>
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 * <p>
 * 输入：s = "(()"
 * 输出：2
 * 解释：最长有效括号子串是 "()"
 * <p>
 * 输入：s = ")()())"
 * 输出：4
 * 解释：最长有效括号子串是 "()()"
 * <p>
 * 输入：s = ""
 * 输出：0
 **/
public class Main {
    public static void main(String[] args) {
        final Main main = new Main();

        System.out.println("main.longestValidParentheses(\"(()\") = " + main.longestValidParentheses("(()"));
        System.out.println("main.longestValidParentheses(\")()())\") = " + main.longestValidParentheses(")()())"));
        System.out.println("main.longestValidParentheses(\"\") = " + main.longestValidParentheses(""));

    }

    public int longestValidParentheses(String s) {
        s = s == null ? "" : s.trim();
        //存'('
        final Stack<Byte> stack = new Stack<>();
        final char RIGHT = ')';

        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (RIGHT == s.indexOf(i)) continue;

            
           
        }
        return max;
    }
}