package 工厂;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:27
 * @desc:
 **/
public class Boat extends TrafficTool {
    public Boat() {
    }

    String name = "boat";

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }
}
