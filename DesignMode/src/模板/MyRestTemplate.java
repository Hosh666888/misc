package 模板;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 17:03
 * @desc:
 **/
public class MyRestTemplate extends RestTemplate<Integer, String> {
    @Override
    String slot(Integer t) {
        return String.valueOf(Math.pow(t, 2));
    }
}
