package Solve_4a;

import java.util.Scanner;

public class addArrayValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        int i;
        System.out.println("Enter array elements: ");
        for (i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 10;
            } else if (arr[i] % 2 != 0) {
                arr[i] += 5;
            }
        }

        System.out.println("Updated Elements: ");
        for (i = 0; i < 10; i++) {
            System.out.println("" + arr[i]);
        }
        sc.close();
    }

}