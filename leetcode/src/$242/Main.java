package $242;

import java.util.HashMap;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/11 16:23
 * @desc: 242. 有效的字母异位词
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().isAnagram(\"anagram\",\"nagaram\") = " + new Main().isAnagram("anagram", "nagaram"));
        System.out.println("new Main().isAnagram(\"rat\",\"car\") = " + new Main().isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        final HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            final char sChar = s.charAt(i);
            final char tChar = t.charAt(i);
            if (!map.containsKey(sChar)) {
                map.put(sChar, 1);
            } else {
                map.put(sChar, map.get(sChar) + 1);
            }

            if (!map.containsKey(tChar)) {
                map.put(tChar, -1);
            } else {
                map.put(tChar, map.get(tChar) - 1);
            }
        }
        return map.values().stream().noneMatch(item -> item != 0);
    }
}