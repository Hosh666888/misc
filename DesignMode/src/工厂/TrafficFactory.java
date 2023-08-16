package 工厂;

import com.sun.istack.internal.NotNull;

import java.lang.reflect.Constructor;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:27
 * @desc:
 **/
public class TrafficFactory {
    public static TrafficTool produce(@NotNull TrafficEnum trafficEnum, boolean singleton) {
        if (trafficEnum == null)
            throw new IllegalArgumentException("invalid param,TrafficEnum can not be null.");
        if (singleton) {
            return TrafficEnum.get(trafficEnum);
        }
        try {
            final Constructor<?> declaredConstructor = trafficEnum.getClazz().getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            return (TrafficTool) declaredConstructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
