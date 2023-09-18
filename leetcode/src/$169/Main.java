package $169;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/10 16:48
 * @desc: 169. 多数元素
 * <p>
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 输入：nums = [3,2,3]
 * 输出：3
 * <p>
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().majorityElement(new int[]{3,2,3}) = " + new Main().majorityElement(new int[]{3, 2, 3}));
        System.out.println("new Main().majorityElement(new int[]{2,2,1,1,1,2,2}) = " + new Main().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));


        System.out.println("Integer.bitCount(3) = " + Integer.bitCount(-2));
    }

    public int majorityElement(int[] nums) {
        int directSkip = Math.max(1, nums.length / 2);
        final HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = 0;
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                count = map.get(num);
                map.put(num, ++count);
            }
            if (count > directSkip)
                return num;
        }


        final Optional<Map.Entry<Integer, Integer>> max = map.entrySet().stream().max((o1, o2) -> o2.getValue() - o1.getValue());
        return max.get().getKey();
    }
}