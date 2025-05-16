import java.util.Scanner;

public class ComputenPr {
    
    static int fact(int n){
        int res = 1;
        for(int i = 2; i<=n;i++){
            res*=i;
        }
        return res;
    }

    static int nPr(int n, int r){
        return fact(n)/fact(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        sc.close();
        System.out.println(nPr(n, r));

    }
}
