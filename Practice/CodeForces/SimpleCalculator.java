import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(X + " + " + Y + " = " + (X + Y));
        System.out.println(X + " * " + Y + " = " + (X * Y));
        System.out.println(X + " - " + Y + " = " + (X - Y));

        sc.close();

    }
}