package 单例;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:53
 * @desc:
 **/
public class Car {
    private Car() {
    }

    private String name;
    private String brand;
    private static final Car instance;

    public static Car GetInstance() {
        return instance;
    }

    static {
        instance = new Car();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
