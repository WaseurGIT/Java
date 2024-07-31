import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        do{
            System.out.println("Insert a number: ");
            num = sc.nextInt();
            System.out.println("Number: ");
            System.out.println(num);
        }while(num>=0);
        
        System.out.println("The end");
    }
}
