import java.time.OffsetDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/8 16:27
 * @desc:
 **/
public class Main {
    private static final Pattern PATTERN = Pattern.compile("a.?");


    public static void main(String[] args) {
        final Matcher matcher = PATTERN.matcher("avaa");

        System.out.println("matcher.groupCount() = " + matcher.groupCount());
        //
        // while (matcher.find()) {
        //     System.out.println("matcher.group() = " + matcher.group());
        // }
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}