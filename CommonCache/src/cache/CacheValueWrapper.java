package cache;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/19 15:37
 * @desc:
 **/
public class CacheValueWrapper<V> {

    public CacheValueWrapper(V data, long expireIn) {
        this.data = data;
        this.expireIn = expireIn;
    }

    private final V data;
    private final long expireIn;

    public V getData() {
        return data;
    }

    public long getExpireIn() {
        return expireIn;
    }
}
