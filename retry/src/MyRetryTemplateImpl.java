/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/24 10:45
 * @desc:
 **/
public class MyRetryTemplateImpl<PARAM,RES> extends AbstractRetryTemplate<PARAM, RES> {

    public MyRetryTemplateImpl(int retry_count) {
        super(retry_count);
    }

    @Override
    public void invokeAfterFail(RetryContext retryContext) {
        System.out.println("操作失败");
        System.out.println("retryContext = " + retryContext);
    }
}
