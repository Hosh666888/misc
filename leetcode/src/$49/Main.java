package $49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/3 10:56
 * @desc: 49. 字母异位词分组
 * <p>
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * <p>
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * 输入: strs = [""]
 * 输出: [[""]]
 **/
public class Main {
    public static void main(String[] args) {
        final Main main = new Main();

        String[] s1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] s2 = {""};
        String[] s3 = {"a"};
        String[] s4 = {"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"};

        System.out.println("main.groupAnagrams(s1) = " + main.groupAnagrams(s1));
        System.out.println("main.groupAnagrams(s2) = " + main.groupAnagrams(s2));
        System.out.println("main.groupAnagrams(s3) = " + main.groupAnagrams(s3));
        System.out.println("main.groupAnagrams(s4) = " + main.groupAnagrams(s4));

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        final HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {

            final char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            final String s = new String(charArray);

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }

}