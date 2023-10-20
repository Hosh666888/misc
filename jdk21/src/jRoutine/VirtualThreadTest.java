package jRoutine;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/11 15:15
 * @desc:
 **/
public class VirtualThreadTest {
    public static void main(String[] args) {
        final ExecutorService pool = Executors.newVirtualThreadPerTaskExecutor();
        int n = 20000;
        AtomicLong rest = new AtomicLong(n);

        for (int i = 0; i < n; i++) {
            pool.execute(() -> {
                rest.decrementAndGet();
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

       


        while (true) {
            int restCount = rest.intValue();
            if (restCount <= 0) break;

            System.out.println(restCount);

        }

        System.out.println("done.");
    }
}
