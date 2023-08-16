package 建造者;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 14:50
 * @desc: 建造者
 **/
public class Car {
    private Car() {
    }

    private String brand;

    private BigDecimal money;

    private LocalDate birth;

    public static class Builder {
        private final Car instance;

        public Builder() {
            instance = new Car();
        }

        public Car build() {
            return instance;
        }

        public Builder brand(String brand) {
            instance.brand = brand;
            return this;
        }

        public Builder birth(LocalDate birth) {
            instance.birth = birth;
            return this;
        }

        public Builder money(BigDecimal money) {
            instance.money = money;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", money=" + money +
                ", birth=" + birth +
                '}';
    }
}
