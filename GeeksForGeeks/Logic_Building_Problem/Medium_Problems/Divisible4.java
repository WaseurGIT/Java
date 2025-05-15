import java.util.Scanner;

public class Divisible4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        sc.close();

        if(n%4==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
