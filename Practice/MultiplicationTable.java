import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a= scanner.nextInt();
        int i;
        System.out.println("Multiplication Table of : "+a);
        for(i=1;i<=10;i++){
            System.out.println(""+a*+i);
        }
        scanner.close();
    }
}
