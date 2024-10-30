import java.util.Scanner;
public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long oddCount = (n+1)/2;
        
        if(k<=oddCount){
            System.out.println(2*k-1);
        }
        else{
            System.out.println(2*(k-oddCount));
        }
        sc.close();
    }
}
