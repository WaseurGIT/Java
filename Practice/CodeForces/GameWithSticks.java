import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int stick = Math.min(n, m);

        if(stick%2 !=0){
            System.out.println("Akshat");
        }
        else{
            System.out.println("Malvika");
        }
        sc.close();
    }
}
