import java.util.Scanner;

public class P4_simpleInterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Principle");
        int principle = sc.nextInt();
        System.out.println("Please Enter Time in year");
        int time = sc.nextInt();
        System.out.println("Please Enter Rate");
        int rate = sc.nextInt();
        System.out.println("Simple interest is " + (principle * time * rate) / 100);

    }
}
