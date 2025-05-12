import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();

        sc.close();

        int total = 0;
        for (int i = 0; i <= n; i++){
            total = total + i;
        }

        System.out.println(total);
    }
}
