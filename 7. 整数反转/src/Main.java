public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(Integer.MAX_VALUE);
    }

    public static int reverse(int x){

        if (x>Integer.MAX_VALUE || x<Integer.MIN_VALUE){
            return 0;
        }

        int temp = Math.abs(x);
        StringBuilder sb = new StringBuilder();

        sb.append(temp);
        sb.reverse();

        if (x<0){
            sb.insert(0,'-');
        }
        int i = new Integer(sb.toString()).intValue();
        return i;
    }
}
