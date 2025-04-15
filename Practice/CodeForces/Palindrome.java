import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i<t;i++){

            String str1 = sc.nextLine();
            str1 = str1.toLowerCase();

            String str2 = new StringBuilder(str1).reverse().toString();

            
            if (str1.equals(str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
        
    }
}
