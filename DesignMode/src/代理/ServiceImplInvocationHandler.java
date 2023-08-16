package 代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 16:13
 * @desc:
 **/
public class ServiceImplInvocationHandler<T> extends MyCustomInvocationHandler<T> {

    public ServiceImplInvocationHandler(T src) {
        super(src);
    }

    public void before(Object proxy, Method method, Object[] args) {
        System.out.println("before");
    }

    @Override
    public void afterReturn(Object proxy, Method method, Object[] args, Object res) {
        System.out.println("after return");
    }

    @Override
    public void afterThrows(Object proxy, Method method, Object[] args, Throwable throwable) {
        System.out.println("after throw");
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(proxy, method, args);
        final Object res;
        try {
            res = method.invoke(src, args);
        } catch (Exception e) {
            afterThrows(proxy, method, args, e);
            throw new RuntimeException(e.getMessage(), e);
        }
        afterReturn(proxy, method, args, res);
        return res;
    }
}
