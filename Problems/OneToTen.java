import java.util.Scanner;

public class OneToTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        // 1
        System.out.println("1 to 10");
        for (i = 1; i <= 10; i++) {
            System.out.println("" + i);
        }
        // 2
        System.out.println("10 to 1");
        for (i = 10; i >= 1; i--) {
            System.out.println("" + i);
        }
        // 3
        System.out.println("L to R");

        System.out.println("Enter L: ");
        int L = scanner.nextInt();

        System.out.println("Enter R: ");
        int R = scanner.nextInt();

        System.out.println("Divisors of 3--> ");
        for (i = L; i <= R; i++) {
            if (i % 3 == 0) {
                System.out.println("" + i);
            }
        }
        scanner.close();
    }
}
