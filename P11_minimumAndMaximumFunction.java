import java.util.Scanner;

public class P11_minimumAndMaximumFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        int max = maxmumNo(a, b, c);
        System.out.println("Maximum No is " + max);
        minmumNo(a, b, c);

    }

    static int maxmumNo(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;

        }
        return max;
    }

    static void minmumNo(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;

        }
        System.out.println("Minmum no is " + min);
    }

}
