import traffic.MapService;
import traffic.MapServiceEnum;
import traffic.MapServiceFactory;
import traffic.TrafficMethod;

import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/11 17:09
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        final MapService mapService = MapServiceFactory.get(MapServiceEnum.BaiDu);
        System.out.println(mapService.name());
        final MapService gaoDe = MapServiceFactory.get(MapServiceEnum.GaoDe);
        System.out.println(gaoDe.name());

        final List<TrafficMethod> list = mapService.reachMethods("adada", "");
        list.sort((o1, o2) -> o1.ordinal() - o2.ordinal());

        System.out.println(list);

    }
}