// Create a basic calculator that can perform addition, subtraction, multiplication, and division.
package Lab_1;

import java.util.Scanner;

public class Solve2 {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("The divisor can not be zero");
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        double a = sc.nextDouble();

        System.out.println("Enter Second number: ");
        double b = sc.nextDouble();

        System.out.println("Chose an operation: +,-,*,/ ");
        char operation = sc.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = sub(a, b);
                break;
            case '*':
                result = mul(a, b);
                break;
            case '/':
                result = div(a, b);
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println("The result is : " + result);

    }
}
