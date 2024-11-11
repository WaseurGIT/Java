import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        if(x>0){
            System.out.println("Positive");
        }
        else if(x==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }

        scanner.close();
    }
}