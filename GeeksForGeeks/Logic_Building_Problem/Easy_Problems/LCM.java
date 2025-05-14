import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp1 = a;
        int temp2 = b;

        sc.close();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int lcm = (temp1 * temp2) / a;

        System.out.println(lcm);
    }
}
