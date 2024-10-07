import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        int total = 0, i;
        int[] array = new int[n];

        for (i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            total += array[i];
        }

        double average = total / n;
        System.out.println("Average: " + average);

        scanner.close();
    }
}
