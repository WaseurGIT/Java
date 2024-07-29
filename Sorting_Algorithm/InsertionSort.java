import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j, n, key = 0;

        System.out.println("Enter the array size: ");
        n = scanner.nextInt();

        int array[] = new int[n];

        System.out.println("Enter Your Numbers: ");
        for (i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        
        System.out.println("After Insertion sort: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        scanner.close();
    }
}
