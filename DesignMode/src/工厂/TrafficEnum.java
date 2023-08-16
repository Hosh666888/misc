package 工厂;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:28
 * @desc:
 **/
public enum TrafficEnum {
    Car(Car.class),
    Boat(Boat.class);


    TrafficEnum(Class<?> clazz) {
        this.clazz = clazz;
    }

    private final Class<?> clazz;

    private static final Map<Class<?>, TrafficTool> cache;

    static {
        cache = new HashMap<>();
        for (TrafficEnum value : values()) {
            try {
                final Constructor<?> declaredConstructor = value.clazz.getDeclaredConstructor();
                declaredConstructor.setAccessible(true);
                final TrafficTool trafficTool = (TrafficTool) declaredConstructor.newInstance();
                cache.put(value.clazz, trafficTool);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static TrafficTool get(TrafficEnum trafficEnum) {
        return cache.getOrDefault(trafficEnum.clazz, null);
    }

    public Class<?> getClazz() {
        return clazz;
    }
}
