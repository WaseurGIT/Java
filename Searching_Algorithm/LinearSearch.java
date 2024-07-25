import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n;
        int[] array = new int[5];

        System.out.println("Enter the array elements: ");
        for (i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the number among the array elements: ");
        n = scanner.nextInt();

        for (i = 0; i < 5; i++) {
            if (array[i] == n) {
                System.out.println("Found at position : " + i);
                return;
            }
        }
        System.out.println("Not found");
        scanner.close();
    }
}
