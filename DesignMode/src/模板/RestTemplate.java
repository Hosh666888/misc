package 模板;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 16:54
 * @desc:
 **/
public abstract class RestTemplate<RequestType, ResponseType> {

    public final ResponseType doPost(String url, RequestType param) {
        logBefore(url);
        final ResponseType slot = slot(param);
        System.out.println("slot = " + slot);
        logAfter(url);
        return slot;
    }


    void logBefore(String url) {
        System.out.println("正在请求:" + url);
    }


    void logAfter(String url) {
        System.out.println("结束请求:" + url);
    }

    abstract ResponseType slot(RequestType t);


}
