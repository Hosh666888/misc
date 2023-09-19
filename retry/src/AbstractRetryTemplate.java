import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/24 10:37
 * @desc:
 **/
public abstract class AbstractRetryTemplate<PARAM, RES> {
    protected int retry_count;
    protected int retry_interval_ms = 2000;
    protected int retry_agg_time_ms = 1000;

    //下次重试休眠 = (n-1) * retry_agg_time_ms + retry_interval_ms

    public AbstractRetryTemplate(int retry_count) {
        this.retry_count = retry_count;
    }

    public AbstractRetryTemplate() {
        retry_count = 3;
    }

    public final RES invoke(Function<PARAM, RES> function, PARAM params) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, InterruptedException {
        final RetryContext retryContext = new RetryContext();
        retryContext.errors = new ArrayList<>();

        int retryCount = 0;
        RES res = null;
        boolean success = false;

        long begin = System.currentTimeMillis();
        do {
            long sleep = (long) (retryCount - 1) * retry_agg_time_ms + retry_interval_ms * (retryCount > 1 ? 1 : 0);
            if (retryCount > 0 && sleep > 0) {
                Thread.sleep(sleep);
                System.out.printf("第%s次重试,已睡眠%sms\n", retryCount, sleep);
            }
            try {
                res = function.apply(params);
                success = true;
                break;
            } catch (Exception e) {
                retryCount++;
                retryContext.errors.add(e);
            }

        } while (retryCount <= retry_count);


        retryContext.timeSpendInMs = System.currentTimeMillis() - begin;
        retryContext.totalTryCount = retryCount;

        if (!success) {
            invokeAfterFail(retryContext);
        }

        return res;
    }


    protected abstract void invokeAfterFail(RetryContext retryContext);


    static class RetryContext {
        protected List<Throwable> errors;

        protected int totalTryCount;

        protected long timeSpendInMs;

        @Override
        public String toString() {
            return "RetryContext{" +
                    "errors=" + errors +
                    ", totalTryCount=" + totalTryCount +
                    ", timeSpendInMs=" + timeSpendInMs +
                    '}';
        }
    }

}
