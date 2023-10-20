package $201_400.$204;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 11:24
 * @desc:
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().countPrimes(10) = " + new Main().countPrimes(10));
        System.out.println("new Main().countPrimes(10) = " + new Main().countPrimes(0));
        System.out.println("new Main().countPrimes(10) = " + new Main().countPrimes(1));
    }

    public int countPrimes(int n) {
        int count = 0;
        if (n < 3) return 0;

        out:
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) continue;
            final int sqrt = (int) Math.sqrt(i);
            for (int j = 2; j < sqrt; j++) {
                if (i % j == 0) {
                    continue out;
                }
            }
            count++;
        }

        return count;

    }
}