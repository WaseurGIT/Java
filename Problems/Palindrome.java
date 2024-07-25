import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Number is Palindrome\n");
        } 
        else {
            System.out.println("Number is not Palindrome\n");
        }
        scanner.close();
    }
}
