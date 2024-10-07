import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit, celsius;

        // fahrenheit to celsius
        System.out.println("Enter Temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " In Celsius:" + celsius + "C");

        // celsius to fahrenheit
        System.out.println("Enter Temperature in Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " In fahrenheit: " + fahrenheit + "F");

        scanner.close();
    }
}