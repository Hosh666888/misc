package 模板.test;

import 模板.MyRestTemplate;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 17:04
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        final MyRestTemplate myRestTemplate = new MyRestTemplate();
        System.out.println("myRestTemplate.doPost(\"http://localhost:13/aaa\",19) = " + myRestTemplate.doPost("http://localhost:13/aaa", 19));

    }
}
