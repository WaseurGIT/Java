import java.util.Scanner;

public class ClosetNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        int q = n / m;
        int lowerBound = q * m;
        int upperBound;

        if(n * m > 0){
            upperBound = (q + 1) * m;
        }
        else{
            upperBound = (q - 1) * m;
        }

        int distance1 = Math.abs(n - lowerBound);
        int distance2 = Math.abs(n - upperBound);

        int closet;

        if(distance1 < distance2){
            closet = lowerBound;
        }
        else{
            closet = upperBound;
        }

        System.out.println(closet);
    }
}
