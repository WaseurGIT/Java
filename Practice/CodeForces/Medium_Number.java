import java.util.Scanner;

public class Medium_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int mid;
            if ((a > b && a < c) || (a > c && a < b)) {
                mid = a;
            } 
            else if ((b > a && b < c) || (b > c && b < a)) {
                mid = b;
            } 
            else {
                mid = c;
            }
            System.out.println(mid);
        }
        sc.close();
    }
}
