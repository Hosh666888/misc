package org.example;

import java.beans.beancontext.BeanContext;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/11 17:01
 * @desc: 278. 第一个错误的版本
 * <p>
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * <p>
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 **/
public class Main {

    boolean isBadVersion(int version) {
        return true;
    }


    public int firstBadVersion(int n) {
        int left = 1, end = n;
        while (left < end) {
            int mid = left + (end - left) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                left++;
            }
        }
        return left;
    }

}