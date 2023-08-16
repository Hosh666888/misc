package 工厂.test;

import 工厂.TrafficEnum;
import 工厂.TrafficFactory;
import 工厂.TrafficTool;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:42
 * @desc: 工厂
 **/
public class Main {
    public static void main(String[] args)  {

        final TrafficTool car = TrafficFactory.produce(TrafficEnum.Car, true);
        final TrafficTool car1 = TrafficFactory.produce(TrafficEnum.Car, true);
        final TrafficTool car2 = TrafficFactory.produce(TrafficEnum.Car, false);

        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println("car2 = " + car2);


    }
}
