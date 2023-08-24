package 代理;

import java.lang.annotation.*;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/17 8:43
 * @desc:
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
@Inherited
public @interface ProxyInvoke {
}
