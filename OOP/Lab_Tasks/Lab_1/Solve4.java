package Lab_1;

import java.util.Scanner;

public class Solve4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int i, smallestValue = 0, highestValue = 0;

        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        smallestValue = highestValue = arr[0];

        for (i = 0; i < n; i++) {
            if (smallestValue > arr[i]) {
                smallestValue = arr[i];
            } else if (highestValue < arr[i]) {
                highestValue = arr[i];
            }
        }

        System.out.println("Smallest Value : " + smallestValue);
        System.out.println("Highest Value: " + highestValue);

    }
}
