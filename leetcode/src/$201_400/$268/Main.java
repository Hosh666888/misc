package $201_400.$268;

import java.util.Arrays;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/11 16:46
 * @desc: 268. 丢失的数字
 * <p>
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().missingNumber(new int[]{3,0,1}) = " + new Main().missingNumber(new int[]{3, 0, 1}));
        System.out.println("new Main().missingNumber(new int[]{0,1}) = " + new Main().missingNumber(new int[]{0, 1}));
        System.out.println("new Main().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}) = " + new Main().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumber(int[] nums) {
        return Arrays.stream(nums).reduce(nums.length * (nums.length + 1) / 2, (i1, i2) -> i1 - i2);
    }
}