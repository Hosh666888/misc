package $7;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/31 15:20
 * @desc: 7. 整数反转
 * <p>
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new $7.Main().reverse(123) = " + new Main().reverse(123));
        System.out.println("new $7.Main().reverse(-123) = " + new Main().reverse(-123));
        System.out.println("new $7.Main().reverse(120) = " + new Main().reverse(120));
        System.out.println("new $7.Main().reverse(0) = " + new Main().reverse(0));
        System.out.println("new $7.Main().reverse(0) = " + new Main().reverse(-2147483648));

    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;

    }


}