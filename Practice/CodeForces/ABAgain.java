import java.util.Scanner;

public class ABAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++) {
            int n =sc.nextInt();
            int rem = n%10;
            int num = n/10;
            int sum = rem + num;
            System.out.println(sum);
        }
        sc.close();
    }
}
