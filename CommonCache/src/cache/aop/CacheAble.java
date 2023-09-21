package cache.aop;

import cache.CacheEnum;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/20 9:16
 * @desc:
 **/
public @interface CacheAble {
    CacheEnum cacheName();

    String key();
}
