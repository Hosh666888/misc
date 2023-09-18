package $344;

import java.util.Arrays;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/8 10:40
 * @desc: 344. 反转字符串
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 输入：s = ["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 **/
public class Main {
    public static void main(String[] args) {

        final char[] charArray = "hello".toCharArray();
        new Main().reverseString(charArray);
        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray));

    }


    public void reverseString(char[] s) {
        char temp;

        for (int i = s.length - 1; i >= s.length / 2; i--) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}