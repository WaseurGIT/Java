import java.util.Scanner;

public class Problem1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        float div;

        try {
            div = a / b;
            System.out.println("Division: " + div);
        } catch (ArithmeticException e) {
            System.out.println("divisor can't be zero");
        }

        sc.close();
    }
}
