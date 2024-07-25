import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int primeNumber = scanner.nextInt();
        int i = 0;

        if (primeNumber <= 1) {
            System.out.println("Not prime or composite number");
        } 
        else {
            for (i = 2; i <= primeNumber / 2; i++) {
                if (primeNumber % i == 0) {
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
        scanner.close();
    }
}
