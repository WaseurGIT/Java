import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int addition=0,subtraction=0,multiplication=0;
        double division = 0;

        System.out.println("Choose an operator:(+,-,*,/):");
        String c = scanner.nextLine();

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        //using if else 
        // if(c.equals("+")){
        //     addition = a+b;
        //     System.out.println("Sum : "+addition);
        // }
        // else if(c.equals("-")){
        //     subtraction = a - b;
        //     System.out.println("Subtraction : "+subtraction);
        // }
        // else if(c.equals("*")){
        //     multiplication = a * b;
        //     System.out.println("Multiplication : "+multiplication);
        // }
        // else if(c.equals("/")){
        //     if (b != 0) {
        //         division = (double) a / b;
        //         System.out.println("Division: "+division);
        //     } 
        //     else {
        //         System.out.println("Division by zero is not allowed");
        //     }
        // }
        
        
        //using switch case
        switch (c) {
            case "+":
                addition = a+b;
                System.out.println("Sum : "+addition);
                break;
            case "-":
                subtraction = a - b;
                System.out.println("Subtraction : "+subtraction);
                break;
            case "*":
                multiplication = a * b;
                System.out.println("Multiplication : "+multiplication);
                break;
            case "/":
                if (b != 0) {
                    division = (double) a / b;
                    System.out.println("Division: "+division);
                } 
                else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("F");
                break;
        }
        scanner.close();
    }
}
