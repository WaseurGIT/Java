import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();

        sc.close();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("first number: "+ a + " Second number: "+b);
        
    }
}
