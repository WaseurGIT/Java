import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        scanner.close();


    }
}
