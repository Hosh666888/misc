package $434;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/22 15:42
 * @desc: 434. 字符串中的单词数
 * <p>
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * <p>
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 **/
public class Main {
    public int countSegments(String s) {
        int cnt = 0;
        final char[] charArray = s.toCharArray();
        int end = -1;
        int begin = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isAlphabetic(charArray[i])) {
                if (begin == -1) {
                    begin = i;
                }
                end = i;
            } else {
                if (end - begin > 0)
                    cnt++;
            }
        }
        return 0;
    }
}
