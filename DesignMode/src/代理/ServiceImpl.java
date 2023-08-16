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
        int i = 1 / 0;
        return Integer.MAX_VALUE;
    }
}
