import java.util.Scanner;

public class DollarToTaka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Amount of Dollar : ");
        double dollar = scanner.nextDouble();

        double taka = (dollar*110.57);
        System.out.println("Total Taka: "+taka);

        System.out.println("Enter Amount of Taka : ");
        double newTaka = scanner.nextDouble();
        
        double takaToDollar = (newTaka/110.57);
        System.out.println("Total Dollar: "+takaToDollar);
        
        scanner.close();
    }
}
