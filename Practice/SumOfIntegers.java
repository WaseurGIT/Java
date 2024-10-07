import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, total = 0;

        System.out.println("Enter any number : ");
        int n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println("Total Sum: " + total);

        //L to R 
        // System.out.println("Enter L: ");
        // int L = scanner.nextInt();
        // System.out.println("Enter R: ");
        // int R = scanner.nextInt();

        // for (i = L; i <= R; i++) {
        //     total += i;
        // }
        // System.out.println("Total Sum: " + total);
        scanner.close();
    }
}
