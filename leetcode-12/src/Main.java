import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/31 10:38
 * @desc: 12. 整数转罗马数字
 * 例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 * 给你一个整数，将其转为罗马数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/integer-to-roman
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().intToRoman(3) = " + new Main().intToRoman(3));
        System.out.println("new Main().intToRoman(3) = " + new Main().intToRoman(4));
        System.out.println("new Main().intToRoman(3) = " + new Main().intToRoman(9));
        System.out.println("new Main().intToRoman(3) = " + new Main().intToRoman(58));
        System.out.println("new Main().intToRoman(3) = " + new Main().intToRoman(1994));
    }

    public String intToRoman(int num) {
        final StringBuilder sb = new StringBuilder();

        final HashMap<Integer, String> map = new HashMap<>(8);
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");


        while (num != 0) {
            final List<Integer> collect = map.keySet().stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
            for (Integer k : collect) {
                int n = num / k;
                for (int i = 0; i < n; i++) {
                    sb.append(map.get(k));
                }
                num %= k;
            }
        }

        return sb.toString();

    }
}