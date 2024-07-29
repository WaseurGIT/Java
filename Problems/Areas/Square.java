package Areas;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one side : ");
        double a = scanner.nextDouble();

        double area = a * a;
        System.out.println("Area of Square: " + area);
        scanner.close();
    }
}
