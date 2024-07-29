package BeeCrowd;

import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, sum;

        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = a + b;
        System.out.println("X = " + sum);
        scanner.close();

    }
}
