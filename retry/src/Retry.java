/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/24 11:33
 * @desc:
 **/
public @interface Retry {
    //wait for next retry turn = (failCount - 1)*retry_agg_time_step + retryInterval_ms*(Math.min(0,failCount))

    int retryCount() default 3;

    long retryInterval_ms() default 1000L;

    long retry_agg_time_step() default 1000L;


    //多次重试失败
    String fallBack() default "";
}
