package $3;

import java.util.HashSet;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/27 15:38
 * @desc: 定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 **/
public class Main {
    public static void main(String[] args) {

        System.out.println(new Main().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new Main().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new Main().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new Main().lengthOfLongestSubstring(""));
        System.out.println(new Main().lengthOfLongestSubstring(" "));
    }


    public int lengthOfLongestSubstring(String s) {
        // if (s == null || s.length() < 1) return 0;
        //
        // final char[] chars = s.toCharArray();
        //
        // int max = 0;
        // for (int i = 0; i < chars.length; i++) {
        //     max = Math.max(max, solve(s, i));
        // }
        // return max;

        return solveWithSlideWindow(s);

    }

    //104ms 43.2M
    public int solve(String s, int beginIndex) {
        final int length = s.length();
        final HashSet<Character> set = new HashSet<>(32);
        for (int i = beginIndex; i < length; i++) {
            final int beforeSize = set.size();
            set.add(s.charAt(i));
            if (beforeSize == set.size()) break;
        }
        return set.size();
    }

    //7ms 41.2M
    public int solveWithSlideWindow(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] secondTime = new int[s.length()];
        final char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            final int i1 = s.indexOf(charArray[i], i + 1);
            secondTime[i] = i1 == -1 ? s.length() : i1;
        }

        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int end = secondTime[i];

            for (int j = i + 1; j < end; j++) {
                end = Math.min(end, secondTime[j]);
            }

            maxLen = Math.max(maxLen, end - i);
        }


        return maxLen;
    }

}