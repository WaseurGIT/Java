import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        sc.close();

        if(num % 2 == 0 ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}