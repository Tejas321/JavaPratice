import java.util.Scanner;

public class P12_pythagorasTriplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        System.out.println("Enter third no");
        int c = sc.nextInt();
        boolean ans = pythagoras(a, b, c);
        System.out.println(ans);

    }

    static boolean pythagoras(int a, int b, int c) {
        if (((a * a) + (b * b)) == (c * c)) {
            return true;
        } else {
            return false;
        }

    }

}
