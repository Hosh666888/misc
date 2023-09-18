package $16;

import java.util.Arrays;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 10:47
 * @desc: 16. 最接近的三数之和
 * <p>
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * <p>
 * 返回这三个数的和。
 * <p>
 * 假定每组输入只存在恰好一个解。
 * <p>
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * <p>
 * 输入：nums = [0,0,0], target = 1
 * 输出：0
 **/
public class Main {
    public static void main(String[] args) {
        final Main main = new Main();

        System.out.println("main.threeSumClosest(new int[]{-1,2,1,-4},1) = " + main.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        System.out.println("main.threeSumClosest(new int[]{0,0,0},1) = " + main.threeSumClosest(new int[]{0, 0, 0}, 1));
        System.out.println("main.threeSumClosest(new int[]{1,1,1,1},0) = " + main.threeSumClosest(new int[]{1, 1, 1, 1}, 0));
        System.out.println("main.threeSumClosest(new int[]{1,1,1,0},-100) = " + main.threeSumClosest(new int[]{1, 1, 1, 0}, -100));
        System.out.println("main.threeSumClosest(new int[]{[4,0,5,-5,3,3,0,-4,-5]},-2) = " + main.threeSumClosest(new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5}, -2));
    }

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3)
            return nums[0] + nums[2] + nums[1];

        int indFirstBigger = -1;
        int sumFirstBigger = -1;
        int gapFirstBigger = -1;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = nums[i] + nums[i + 1] + nums[i + 2];
            if (sum > target) {
                indFirstBigger = i;
                sumFirstBigger = sum;
                gapFirstBigger = Math.abs(sum - target);
                break;
            }
        }

        if (indFirstBigger == 0) {
            return nums[0] + nums[1] + nums[2];
        } else if (indFirstBigger > 0) {
            int beforeSum = nums[indFirstBigger - 1] + nums[indFirstBigger] + nums[indFirstBigger + 1];
            int gap = Math.abs(beforeSum - target);
            return gap < gapFirstBigger ? beforeSum : sumFirstBigger;
        } else {
            return nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        }


    }
}