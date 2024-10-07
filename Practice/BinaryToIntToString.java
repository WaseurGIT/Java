import java.util.Scanner;

public class BinaryToIntToString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary,2);

        String decimalStr = Integer.toString(decimal);

        System.out.println("Binary : "+binary);
        System.out.println("Integer: "+decimal);
        System.out.println("String : "+decimalStr);
    }
}
