import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/27 14:53
 * @desc:给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 **/
public class Main {

    private static final HashMap<Character, List<Character>> map = new HashMap<>();

    static {
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    public static void main(String[] args) {

        ArrayList<String> res = new ArrayList<>();
        findSeq(res, "23");
        System.out.println(res);

    }

    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        findSeq(res, digits);
        return res;
    }

    public static void findSeq(List<String> res, String input) {

        if (input == null || input.length() == 0) return;

        final char c = input.charAt(0);
        final List<Character> sections = map.get(c);

        if (res.isEmpty()) {
            for (Character section : sections) {
                res.add(section.toString());
            }
        } else {
            final ArrayList<String> sb = new ArrayList<>();
            res.forEach(origin -> {
                sections.forEach(section -> {
                    sb.add(origin + section.toString());
                });
            });
            res.clear();
            res.addAll(sb);
        }

        try {
            input = input.substring(1);
        } catch (Exception e) {
            input = null;
        }
        findSeq(res, input);
    }
}
