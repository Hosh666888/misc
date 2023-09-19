package cache;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/19 15:36
 * @desc:
 **/
public class Cache<K, V> {
    protected Cache() {

    }

    private static final Logger log = LoggerFactory.getLogger(Cache.class);
    private final ReentrantLock lock = new ReentrantLock(true);
    private ConcurrentHashMap<K, CacheValueWrapper<V>> storage = new ConcurrentHashMap<>();


    private Duration expire = Duration.ofMinutes(1L);
    private Duration randomAppend;
    private Function<Object, V> loadFunction;

    public void add(K key, V value) {
        if (key == null)
            throw new IllegalArgumentException("cache key can not be null.");
        storage.put(key, new CacheValueWrapper<V>(value, generateExpireTime()));
    }

    public V get(K key) {
        if (ifExpiredOrNotExist(key)) {
            if (loadFunction == null) return null;
            //reload data
            try {
                lock.lock();
                if (ifExpiredOrNotExist(key)) {
                    log.debug("reloading data,key={}", key);
                    final V apply = loadFunction.apply(null);
                    storage.put(key, new CacheValueWrapper<>(apply, generateExpireTime()));
                    log.debug("reloaded new data,key={} value={}", key, apply.toString());
                }
            } finally {
                lock.unlock();
            }
        }
        return storage.get(key).getData();
    }

    public boolean ifExpiredOrNotExist(K key) {
        if (key == null || !storage.containsKey(key)) return false;
        final CacheValueWrapper<V> vCacheValueWrapper = storage.get(key);
        final Long expireIn = Optional.ofNullable(vCacheValueWrapper).map(CacheValueWrapper::getExpireIn).orElse(0L);
        return expireIn < System.currentTimeMillis();
    }

    public void clearUp() {
        storage.clear();
    }


    private long generateExpireTime() {
        return System.currentTimeMillis() + expire.toMillis() + Optional.ofNullable(randomAppend).map(Duration::toMillis).orElse(0L);
    }


    protected void setExpire(Duration expire) {
        this.expire = expire;
    }

    protected void setLoadFunction(Function<Object, V> function) {
        loadFunction = function;
    }

    protected void setRandomAppend(Duration randomAppend) {
        this.randomAppend = randomAppend;
    }

    public static <K, V> CacheBuilder<K, V> builder() {
        return new CacheBuilder<>();
    }

    protected void resizeStorage(int size) {
        size = Math.max(16, size);
        if (storage == null || storage.isEmpty()) {
            storage = new ConcurrentHashMap<>(size);
        } else {
            throw new RuntimeException("can not resize storage size.cause storage is not empty or null.");
        }
    }
}
