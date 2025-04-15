import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        sc.close();
        String str2 = "";

        str1 = str1.toLowerCase();

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }

        if (str1.equals(str2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
