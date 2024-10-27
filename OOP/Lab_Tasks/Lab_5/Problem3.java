import java.util.Scanner;

public class Problem3 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int[] array = { 10, 20, 30, 40, 50 };

        try {
            System.out.print("Enter an integer to divide: ");
            int number = scanner.nextInt();
            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            int divisionResult = number / divisor;
            System.out.println("Division Result: " + divisionResult);

            System.out.print("Enter an index to access from the array: ");
            int index = scanner.nextInt();
            int arrayElement = array[index];
            System.out.println("Element at index " + index + " is " + arrayElement);

            System.out.print("Enter a number as a string to parse: ");
            String numberString = scanner.next();
            int parsedNumber = Integer.parseInt(numberString);
            System.out.println("Parsed number is: " + parsedNumber);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}