package Array;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n;

        System.out.println("Enter how many numbers do you want to set in array: ");
        n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array elements: ");
        for (i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Even Numbers: ");
        for (i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("" + array[i]);
            }
        }
        scanner.close();

    }
}
