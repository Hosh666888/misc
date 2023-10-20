import java.io.*;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/9 9:02
 * @desc:
 **/
public class DataHelper {

    public String read(InputStream inputStream) throws IOException {
        if (inputStream == null) throw new NullPointerException("stream is empty.");

        String msg;
        try (final InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
             final BufferedReader reader = new BufferedReader(inputStreamReader)
        ) {
            msg = reader.readLine();
        }
        return msg;
    }

    public void write(OutputStream outputStream, String msg) throws IOException {
        if (outputStream == null) throw new NullPointerException("stream is empty.");
        if (msg == null || msg.trim().length() < 1) throw new IllegalArgumentException("msg can not be null or empty!");


        final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        final BufferedWriter writer = new BufferedWriter(outputStreamWriter);
        writer.write(msg);
        writer.newLine();

        writer.close();
        outputStreamWriter.close();

    }


}
