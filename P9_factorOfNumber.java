import java.util.Scanner;

public class P9_factorOfNumber {
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();for(
    int i = 1;i<=num;i++)
    {
        if (num % i == 0) {
            System.out.print(i + " ");
        }
    }

}
