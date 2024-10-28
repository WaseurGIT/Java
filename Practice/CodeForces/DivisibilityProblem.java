import java.util.Scanner;
public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();

        while (t-->0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int rem = a%b;
            int moves = (rem == 0)? 0: (b-rem);
            System.out.println(moves);
        }
        sc.close();
    }
}
