import java.util.Scanner;

public class NthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        int distance = b - a;
        int value = a + (n - 1) * distance;
        System.out.println(value);
    }
}
