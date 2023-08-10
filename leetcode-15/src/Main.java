import com.sun.org.apache.bcel.internal.generic.FieldGenOrMethodGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/31 10:57
 * @desc: 15. 三数之和
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 * <p>
 * 你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().threeSum() = " + new Main().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println("new Main().threeSum() = " + new Main().threeSum(new int[]{0, 1, 1}));
        System.out.println("new Main().threeSum() = " + new Main().threeSum(new int[]{0, 0, 0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        final ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        int last = -999;
        for (int i = 0; i < nums.length; i++) {
            int begin = nums[i];
            if (begin == last) continue;
            last = begin;
            int l = i + 1, r = nums.length - 1;


            while (l < r) {
                int sum = nums[l] + nums[r] + begin;
                if (sum == 0) {
                    if (nums[l] == nums[r])
                        continue;
                    res.add(Arrays.asList(begin, nums[l], nums[r]));
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }


        return res;
    }
}