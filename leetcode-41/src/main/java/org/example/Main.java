package org.example;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/4 16:22
 * @desc: 41. 缺失的第一个正数
 * <p>
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 * <p>
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 * <p>
 * 输入：nums = [1,2,0]
 * 输出：3
 * <p>
 * 输入：nums = [3,4,-1,1]
 * 输出：2
 * <p>
 * 输入：nums = [7,8,9,11,12]
 * 输出：1
 **/
public class Main {
    public static void main(String[] args) {
        final Main main = new Main();
        System.out.println("main.firstMissingPositive(new int[]{1,2,0}) = " + main.firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println("main.firstMissingPositive(new int[]{3,4,-1,1}) = " + main.firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println("main.firstMissingPositive(new int[]{7,8,9,11,12}) = " + main.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }

    public int firstMissingPositive(int[] nums) {
        int minn = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < 0) continue;
            min = Math.min(min, num);
        }

        for (int i = 0; i < min; i++) {

        }

        return min + 1;
    }

}