import java.io.*;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/15 15:53
 * @desc:
 **/
public interface DeepCloneable {
    default <T extends Serializable> T deepClone(T t) throws IOException {
        try (final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             final ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)
        ) {
            oos.writeObject(t);
            return (T) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

}
