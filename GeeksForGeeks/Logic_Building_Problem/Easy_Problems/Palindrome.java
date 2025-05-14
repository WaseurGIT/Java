import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();

        int rev = 0;
        int temp = a;
        while (a != 0) {
            int digit = a % 10;
            rev = (rev * 10) + digit;
            a = a / 10; 
        }

        if(temp == rev){
            System.out.println("fucking Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
