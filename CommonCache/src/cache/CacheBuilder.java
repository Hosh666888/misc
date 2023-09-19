package cache;

import java.time.Duration;
import java.util.function.Function;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/19 16:30
 * @desc:
 **/
public class CacheBuilder<K, V> {
    private final Cache<K, V> cache = new Cache<>();

    public CacheBuilder<K, V> initSize(int size) {
        cache.resizeStorage(size);
        return this;
    }

    public CacheBuilder<K, V> expiredIn(Duration duration) {
        cache.setExpire(duration);
        return this;
    }

    public CacheBuilder<K, V> randomAppendExpireTime(Duration duration) {
        cache.setRandomAppend(duration);
        return this;
    }

    public CacheBuilder<K, V> loadFunction(Function<Object, V> function) {
        cache.setLoadFunction(function);
        return this;
    }

    public Cache<K, V> build() {
        return cache;
    }

}
