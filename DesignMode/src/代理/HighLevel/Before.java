package 代理.HighLevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/17 8:47
 * @desc:
 **/

@Retention(RetentionPolicy.RUNTIME)
@Aop
public @interface Before{
    Class<?> aspectClass();

}
