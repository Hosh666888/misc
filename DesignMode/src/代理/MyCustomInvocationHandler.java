package 代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 16:21
 * @desc:
 **/
public abstract class MyCustomInvocationHandler<T> implements InvocationHandler {
    protected T src;

    public MyCustomInvocationHandler(T src) {
        this.src = src;
    }

    @Override
    public abstract Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

    public abstract void before(Object proxy, Method method, Object[] args);

    public abstract void afterReturn(Object proxy, Method method, Object[] args, Object res);

    public abstract void afterThrows(Object proxy, Method method, Object[] args, Throwable throwable);

}
