import java.util.Scanner;

public class PrimeNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n, count, j;

        System.out.println("Enter array size: ");
        n = scanner.nextInt();

        int primeArray[] = new int[n];

        System.out.println("Enter array elements: ");
        for (i = 0; i < n; i++) {
            primeArray[i] = scanner.nextInt();
        }

        for (i = 0; i < n; i++) {
            count = 0;
            for (j = 2; j < primeArray[i]; j++) {
                if (primeArray[i] % j == 0) {
                    count = 1;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(primeArray[i] + " is a Prime Number");
            } 
            else {
                System.out.println(primeArray[i] + " is not a Prime Number");
            }
        }
        
        scanner.close();
    }
}
