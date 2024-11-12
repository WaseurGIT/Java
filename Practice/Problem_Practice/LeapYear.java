import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is Leap Year");
        } 
        else {
            System.out.println(year + " is not leap year");
        }

        scanner.close();
    }
}