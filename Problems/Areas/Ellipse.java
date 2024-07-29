package Areas;
import java.util.Scanner;

public class Ellipse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.1416;

        System.out.println("Enter Major Axis: ");
        double majorRadius = scanner.nextDouble();

        System.out.println("Enter Minor Axis: ");
        double minorRadius = scanner.nextDouble();

        double area = pi * majorRadius * minorRadius;
        System.out.println("Area of Ellipse: " + area);

        scanner.close();
    }
}
