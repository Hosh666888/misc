package traffic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/11 17:14
 * @desc:
 **/
public class MapServiceFactory {
    private MapServiceFactory() {
    }

    private static final ReentrantLock lock = new ReentrantLock();
    private static final ConcurrentHashMap<String, MapService> cache = new ConcurrentHashMap<>();


    public static MapService get(MapServiceEnum mapServiceEnum) {
        if (mapServiceEnum == null) return null;
        if (!cache.isEmpty()) return cache.getOrDefault(mapServiceEnum.name(), null);

        while (lock.tryLock()) {
            if (!cache.isEmpty()) break;
            try {
                System.out.println("正在加载数据");
                for (MapServiceEnum value : MapServiceEnum.values()) {
                    final Class<?> targetClazz = value.getTargetClazz();
                    final Constructor<?> constructor = targetClazz.getDeclaredConstructor();
                    constructor.setAccessible(true);
                    final MapService mapService = (MapService) constructor.newInstance();
                    cache.put(value.name(), mapService);
                }
                System.out.printf("成功加载%d个地图提供方%n", cache.size());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    lock.unlock();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;
        }

        return cache.getOrDefault(mapServiceEnum.name(), null);

    }
}
