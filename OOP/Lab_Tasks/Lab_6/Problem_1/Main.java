package Problem_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account ac = new Account("2", 12577);

        System.out.println("Enter withdraw amount:");
        double amount = sc.nextDouble();
        try{
            ac.Withdraw(amount);
            System.out.println("Account Number: "+ac.getAccountNumber());
            System.out.println("New Balance: "+ac.getBalance());
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
