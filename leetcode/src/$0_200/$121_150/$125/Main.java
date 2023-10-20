package $0_200.$121_150.$125;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/18 10:04
 * @desc: 125. 验证回文串
 * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 * 字母和数字都属于字母数字字符。
 * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 * <p>
 * 输入: s = "A man, a plan, a canal: Panama"
 * 输出：true
 * 解释："amanaplanacanalpanama" 是回文串。
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println("new Main().isPalindrome(\"A man, a plan, a canal: Panama\") = " + new Main().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("new Main().isPalindrome(\"race a car\") = " + new Main().isPalindrome("race a car"));
        System.out.println("new Main().isPalindrome(\" \") = " + new Main().isPalindrome(" "));
    }

    public boolean isPalindrome(String s) {
        s = s.trim();
        if (s.isEmpty()) return true;
        int begin = 0, end = s.length() - 1;

        while (begin < end) {
            char b = s.charAt(begin);
            char e = s.charAt(end);

            if (!Character.isLetterOrDigit(b)) {
                begin++;
                continue;
            }
            if (!Character.isLetterOrDigit(e)) {
                end--;
                continue;
            }

            if (Character.toLowerCase(b) != Character.toLowerCase(e)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }


}
