import java.util.Scanner;

public class P8_difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int num = sc.nextInt();
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;

        }
        System.out.println(product - sum);
    }
}
