package cache;

import java.time.Duration;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/19 16:49
 * @desc:
 **/
public enum CacheEnum {
    User,
    Progress;


    static {

        User.cache = Cache.<String, String>builder()
                .initSize(16)
                .expiredIn(Duration.ofMinutes(1L))
                .randomAppendExpireTime(Duration.ofSeconds(10))
                .build();

        Progress.cache = Cache.<String, Integer>builder()
                .initSize(1)
                .loadFunction(o -> 1)
                .build();
    }

    private Cache<?, ?> cache;
    private String desc;


    public Cache<?, ?> getCache() {
        return cache;
    }

    public void setCache(Cache<?, ?> cache) {
        this.cache = cache;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
