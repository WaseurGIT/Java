import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base fee: ");
        double baseFee = sc.nextDouble();

        System.out.println("Enter premium fee: ");
        double premiumFee = sc.nextDouble();

        System.out.println("Enter vip Fee: ");
        double vipFee = sc.nextDouble();

        VIPSubscription obj1 = new VIPSubscription(baseFee, premiumFee, vipFee);

        sc.close();
    }
}
