import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();

        if((b + c)>a && (a + b)>c && (a + c)>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Fucking invalid");
        }
    }
}
