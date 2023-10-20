import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/8 16:52
 * @desc:
 **/
public class Server {

    public static void main(String[] args) throws IOException {

        final ExecutorService pool = Executors.newFixedThreadPool(100);

        try (final ServerSocket server = new ServerSocket(8000)) {
            System.out.println("server started,listen on 8000.");



            while (true) {
                final Socket client = server.accept();

                final InetAddress inetAddress = client.getInetAddress();
                System.out.println("inetAddress.getCanonicalHostName() = " + inetAddress.getCanonicalHostName());

                pool.execute(() -> {
                    try {
                        final InputStream inputStream = client.getInputStream();
                        final OutputStream outputStream = client.getOutputStream();
                        final DataHelper helper = new DataHelper();

                        final String request = helper.read(inputStream);
                        String msg = Thread.currentThread().getName() + ":" + request;
                        System.out.println(msg);

                        helper.write(outputStream, msg);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }
        }

    }
}