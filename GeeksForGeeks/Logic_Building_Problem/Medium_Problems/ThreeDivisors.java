import java.util.Scanner;

public class ThreeDivisors {


    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for(int i = 2; i*i<=n ;i++){
            if(isPrime(i)){
                int sq = i*i;
                if(sq<=n){
                    System.out.println(sq);
                }
            }
        }
    }
}