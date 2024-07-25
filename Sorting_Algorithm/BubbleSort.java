import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j, temp = 0, n;

        System.out.println("Enter how many number do you want to be sorted: ");
        n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter Your elements: ");
        for (i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorted: ");
        for (i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }

        scanner.close();
    }
}