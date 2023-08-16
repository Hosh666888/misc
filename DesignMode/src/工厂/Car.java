package 工厂;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:26
 * @desc:
 **/
public class Car extends TrafficTool {
    private Car() {
    }
    String name = "car";

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
