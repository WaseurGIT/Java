import java.util.Scanner;

public class Primes {

    public static boolean isPrime(long n) {
        if (n <= 2) {
            return false;
        }
        if(n == 2){
            return true;
        }
        if (n%2==0) {
            return false;
        }
        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        
        if (n < 5) {
            System.out.println("-1");
        } 
        if (isPrime(n - 2)) {
            System.out.println(2+" "+(n-2));
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}
