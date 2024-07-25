import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n, start, end, middle;
        int[] array = new int[5];

        System.out.println("Enter sorted array elements(asc): ");
        for (i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter a number among the array elements: ");
        n = scanner.nextInt();

        start = 0;
        end = 4;

        while (start <= end) {
            middle = (start + end) / 2;
            if (array[middle] == n) {
                System.out.println("Found at index: " + middle);
                return;
            } else if (array[middle] < n) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (start > end) {
            System.out.println("Not found");
        }
        scanner.close();

    }
}
