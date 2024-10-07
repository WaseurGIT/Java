package Areas;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Height: ");
        double height = scanner.nextDouble();

        System.out.println("Enter Base: ");
        double base = scanner.nextDouble();

        double area = 0.5 * height * base;

        System.out.println("Area of Triangle: " + area);
        scanner.close();
    }
}
