package 代理;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 16:12
 * @desc:
 **/
public class ServiceImpl implements IService {
    @Override
    public int work() {
        return Integer.MAX_VALUE;
    }

    @Override
    @ProxyInvoke
    public int work2() {
        return 22222222;
    }
}
