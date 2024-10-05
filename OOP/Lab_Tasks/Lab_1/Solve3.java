// Write a program that calculates and prints the sum of integers from 1 to N, where N is taken as user input.
package Lab_1;

import java.util.Scanner;

public class Solve3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0, i;

        for (i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);
    }

}
