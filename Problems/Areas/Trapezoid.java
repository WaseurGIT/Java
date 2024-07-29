package Areas;
import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Base 1 : ");
        double base_1 = scanner.nextDouble();

        System.out.println("Enter Base 2 : ");
        double base_2 = scanner.nextDouble();

        System.out.println("Enter Vertical Height: ");
        double height = scanner.nextDouble();

        double area = 0.5 * (base_1 + base_2) * height;
        System.out.println("Area of Trapezium: " + area);

        scanner.close();
    }
}
