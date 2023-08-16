package 建造者.test;


import 建造者.Car;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 14:51
 * @desc: 建造者模式
 **/
public class Main {
    public static void main(String[] args) {
        final Car car = new Car.Builder()
                .birth(LocalDate.now())
                .brand("myCar")
                .money(new BigDecimal("12.00001231"))
                .build();

        System.out.println("car = " + car);


    }
}
