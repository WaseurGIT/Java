import java.util.Scanner;

public class Solve2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int originalNumber = n;
        int rem, reverse = 0;

        while(n!=0){
            rem = n%10;
            reverse = reverse * 10 +rem;
            n = n/10;
        }

        if(originalNumber == reverse ){
            System.out.println(originalNumber+" is a Palindrome Number");
        }
        else{
            System.out.println(originalNumber+" is Not a Palindrome Number");
        }
    }
}
