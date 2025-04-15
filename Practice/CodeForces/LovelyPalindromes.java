import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        sc.close();

        String str = new StringBuilder(n).reverse().toString();

        String str2 = n +str;
        System.out.println(str2);

    }
}
