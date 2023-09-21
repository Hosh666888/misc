package cache.aop;

import cache.CacheEnum;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/20 9:17
 * @desc:
 **/
public @interface RefreshCache {
    CacheEnum cacheName();

    String key() default "";

    boolean flushAll() default false;
}
