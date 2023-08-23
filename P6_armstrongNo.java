import java.util.Scanner;

public class P6_armstrongNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int m = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;

        }
        if (m == sum) {
            System.out.println("No is Armstrong");
        } else {
            System.out.println("No is not Armstrong");
        }

    }
}
