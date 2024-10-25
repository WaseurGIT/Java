import java.util.Scanner;

import implementations.AdvancedMath;

public class Test {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        AdvancedMath obj = new AdvancedMath();

        System.out.println("Add : "+obj.add(a, b));
        System.out.println("Subtract: "+obj.subtract(a, b));
        System.out.println("Power: "+obj.power(a, b));
        System.out.println("Division: "+obj.divide(a, b));

        sc.close();
    }
}
