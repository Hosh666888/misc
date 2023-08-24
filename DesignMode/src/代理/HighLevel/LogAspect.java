package 代理.HighLevel;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/17 8:51
 * @desc:
 **/
public class LogAspect extends AbstractAspect {
    @Override
    void before(Object proxy, Method method, Object[] args) {
        System.out.printf("进入方法%s,请求参数:%s\n", method.getName(), Arrays.toString(args));
    }

    @Override
    void afterThrowing(Object proxy, Method method, Object[] args, Throwable e) {
        System.out.printf("执行%s时,抛出异常:", e.getMessage());
    }
}
