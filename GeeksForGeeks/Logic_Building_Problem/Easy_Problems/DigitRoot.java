import java.util.Scanner;

public class DigitRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();

        int sum = 0;
        while (a != 0) {
            int digit = a % 10;
            sum += digit;
            a = a /10;
        }

        System.out.println(sum);

        int newSum = 0;
        while (sum != 0) {
            int sumDigit = sum % 10;
            newSum += sumDigit;
            sum = sum / 10;
        }

        System.out.println(newSum);
    }
}
