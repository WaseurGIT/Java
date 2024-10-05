// TASK - 1 : Check Prime Number: Write a program that checks whether a given number is a prime number.
import java.util.Scanner;

public class Solve1 {

    public static boolean checkPrime(int a) {
        if (a <= 1) {
            System.out.println("Number must be greater than 1");
            return false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter a number: ");
        n = sc.nextInt();

        if (checkPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

    }

}