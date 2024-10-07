import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n;

        System.out.println("Enter how many numbers do want to see: ");
        n = scanner.nextInt();

        int array[] = new int[n];

        array[0] = 0;
        array[1] = 1;

        for (i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println("Fibonacci Series : ");
        
        for (i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }

        scanner.close();
    }
}
