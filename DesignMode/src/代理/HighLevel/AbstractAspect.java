package 代理.HighLevel;

import java.lang.reflect.Method;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/17 8:49
 * @desc: 抽象切面
 **/
public abstract class AbstractAspect {

    void before(Object proxy, Method method, Object[] args) {
    }

    void afterThrowing(Object proxy, Method method, Object[] args, Throwable e) {
    }


}
