import java.util.Scanner;

public class P13_primeNoInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        prime(a, b);

    }

    static void prime(int a, int b) {
        for (int i = a; i <= b; i++) {
            int flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }

    }

}
