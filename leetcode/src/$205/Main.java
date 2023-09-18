package $205;

import java.util.ArrayList;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/11 15:31
 * @desc: 205. 同构字符串
 * <p>
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 * <p>
 * 输入：s = "egg", t = "add"
 * 输出：true
 * <p>
 * 输入：s = "paper", t = "title"
 * 输出：true
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().isIsomorphic(\"egg\",\"add\") = " + new Main().isIsomorphic("egg", "add"));
        System.out.println("new Main().isIsomorphic(\"foo\",\"bar\") = " + new Main().isIsomorphic("foo", "bar"));
        System.out.println("new Main().isIsomorphic(\"paper\",\"title\") = " + new Main().isIsomorphic("paper", "title"));
    }

    public boolean isIsomorphic(String s, String t) {
        final ArrayList<Character> ls = new ArrayList<>();
        final ArrayList<Character> lt = new ArrayList<>();
        final char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            final char sItem = s.charAt(i);
            final char tItem = t.charAt(i);
            if (!ls.contains(sItem)) {
                ls.add(sItem);
            }
            if (!lt.contains(tItem)) {
                lt.add(tItem);
            }
            final int sIdx = ls.indexOf(sItem);
            final int tIdx = lt.indexOf(tItem);

            if (sIdx != tIdx)
                return false;
        }
        return true;
    }
}