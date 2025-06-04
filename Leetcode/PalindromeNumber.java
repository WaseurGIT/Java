import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        int temp = n;
        int rev = 0;

        while (n!=0) {
            int rem = n%10;
            rev = rev *10 + rem;
            n = n/10; 
        }

        if(rev == temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
