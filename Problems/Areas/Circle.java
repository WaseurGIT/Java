import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.1416;
        System.out.println("Enter Radius: ");
        double r = scanner.nextDouble();

        double area = pi * r * r;
        System.out.println("Area of Circle: " + area);

        scanner.close();
    }
}
