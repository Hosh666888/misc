package traffic;

import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/11 17:09
 * @desc:
 **/
public interface MapService {
    /**
     *
     * @param start 起始
     * @param end   终点
     * @return 交通工具
     */
    List<TrafficMethod> reachMethods(String start, String end);

    String name();
}
