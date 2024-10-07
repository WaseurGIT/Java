package Areas;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Length: ");
        double length = scanner.nextDouble();

        System.out.println("Enter Width: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Area of Rectangle: " + area);

        scanner.close();
    }
}
