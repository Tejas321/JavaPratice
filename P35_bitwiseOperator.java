public class P35_bitwiseOperator {
    public static void main(String[] args) {
        int n = 35;
        String ans = evenodd(n);
        System.out.println(ans);
    }

    static String evenodd(int n) {
        if ((n & 1) == 1) {
            return "odd";
        }
        return "even";
    }
}
