import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/24 10:37
 * @desc:
 **/
public class Main {

    volatile static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, InterruptedException {

        // System.out.println("new MyRetryTemplateImpl<String, String>(5).invoke(param -> {\n            final int i = count.incrementAndGet();\n            System.out.println(\"操作\" + i);\n            if (i < 3) {\n                int b = 1 / 0;\n            }\n            return param;\n        }, \"嘿嘿嘿\") = " +
        //         new MyRetryTemplateImpl<String, String>(5).invoke(param -> {
        //             final int i = count.incrementAndGet();
        //             System.out.println("操作" + i);
        //             if (i < 3) {
        //                 int b = 1 / 0;
        //             }
        //             return param;
        //         }, "嘿嘿嘿"));
        //
        //
        // new AbstractRetryTemplate<Integer, Integer>() {
        //     @Override
        //     protected void invokeAfterFail(RetryContext retryContext) {
        //
        //     }
        // }.invoke(param -> param, 1);


        final ProcessBuilder java = new ProcessBuilder().command("java");
        try {
            final Process start = java.start();
            try (InputStream outputStream = start.getInputStream()) {
                final InputStreamReader inputStreamReader = new InputStreamReader(outputStream);
                System.out.println("new BufferedReader(inputStreamReader).readLine() = " + new BufferedReader(inputStreamReader).readLine());
            }
            System.out.println("start = " + start);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}