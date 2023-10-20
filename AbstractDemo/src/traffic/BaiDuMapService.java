package traffic;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/11 17:13
 * @desc:
 **/
public class BaiDuMapService implements MapService {
    private BaiDuMapService() {
    }

    @Override
    public List<TrafficMethod> reachMethods(String start, String end) {
        return Arrays.asList(TrafficMethod.TAXI, TrafficMethod.SUBWAY);
    }

    @Override
    public String name() {
        return "百度";
    }
}
