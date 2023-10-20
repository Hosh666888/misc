package traffic;

import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/11 17:12
 * @desc:
 **/
public class GaoDeMapService implements MapService {
    private GaoDeMapService() {
    }

    @Override
    public List<TrafficMethod> reachMethods(String start, String end) {
        return null;
    }

    @Override
    public String name() {
        return "高德";
    }
}
