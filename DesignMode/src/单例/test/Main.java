package 单例.test;

import 单例.Car;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:54
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        final Car car = Car.GetInstance();
        final Car car1 = Car.GetInstance();


        car1.setBrand("adada");
        car1.setName("huiihnkln");

        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
        System.out.println(car);
        System.out.println(car1);


    }
}
