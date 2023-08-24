package 代理.test;

import 代理.IService;
import 代理.ServiceImpl;
import 代理.ServiceImplInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 16:15
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {

        final IService service = new ServiceImpl();

        final IService iService = (IService) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), new ServiceImplInvocationHandler<>(service));

        System.out.println("iService.work() = " + iService.work());
        System.out.println("=======================================================");
        System.out.println("iService.work2() = " + iService.work2());


    }
}
