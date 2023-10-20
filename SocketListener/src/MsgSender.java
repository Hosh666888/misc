import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.time.Duration;
import java.util.Stack;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/8 16:57
 * @desc:
 **/
public class MsgSender {

    private static final Duration CONNECT_TIMEOUT = Duration.ofMinutes(1L);

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            int finalI = i;
            new Thread(() -> {
                String msg = String.format("来自%s的消息", Integer.toString(finalI, 10));

                try {
                    final Socket socket = new Socket("127.0.0.1", 8000);
                    final OutputStream outputStream = socket.getOutputStream();
                    final InputStream inputStream = socket.getInputStream();


                    final DataHelper helper = new DataHelper();
                    try {
                        helper.write(outputStream, msg);
                        System.out.printf("%s成功发送消息%n", finalI);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Stack


                    long end = System.currentTimeMillis() + CONNECT_TIMEOUT.toMillis();
                    while (System.currentTimeMillis() < end) {
                        if (inputStream.available() > 0) {
                            final String response = helper.read(inputStream);
                            System.out.println(response);
                            break;
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

        }

        while (true) {
        }


    }
}
