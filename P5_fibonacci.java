import java.util.Scanner;

public class P5_fibonacci {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;for(
    int i = 2;i<n;i++)
    {
        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;
    }
}
