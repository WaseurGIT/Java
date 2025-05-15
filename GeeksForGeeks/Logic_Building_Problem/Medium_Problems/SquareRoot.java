import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = (int) Math.floor(Math.sqrt(n));
        System.out.println(res);
        
    }
}