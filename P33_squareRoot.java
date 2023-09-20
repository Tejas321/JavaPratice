public class P33_squareRoot {
    public static void main(String[] args) {
        int x = 8;
        int start = 1;
        int end = x;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == x) {
                System.out.println(mid);
            } else if ((long) mid * mid > (long) x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(end);

    }

}
