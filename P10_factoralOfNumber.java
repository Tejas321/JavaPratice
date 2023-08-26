import java.util.Scanner;

public class P10_factoralOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        while (num > 1) {
            fact = fact * (num);
            num = num - 1;
        }
        System.out.println("Factorial is " + fact);

    }

}
