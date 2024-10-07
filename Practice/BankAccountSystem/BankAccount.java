package BankAccountSystem;

import java.util.Scanner;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private int deposit;
   
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public int getBalance(){
        return balance;
    }
    
    public void setBalance(int balance){
        this.balance=balance;
    }
   
    public void depositMoney(int amount) {
        this.deposit += amount;
        System.out.println("Deposit:" + this.deposit);
    }
   
    public void displayBankAccount(){
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Balance: "+this.balance);
        System.out.println("Deposit: "+this.deposit);
    }

    public static void main(String[] args) {

        //create a BankAccount Object
        BankAccount customer = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number:");
        int accountNumber = scanner.nextInt();

        int balance = 1254;
        System.out.println("Your Balance:"+balance);
        
        System.out.println("Enter Deposit Amount:");
        int deposit = scanner.nextInt();
        
        customer.setAccountNumber(accountNumber);
        customer.setBalance(balance);
        customer.depositMoney(deposit);
        customer.displayBankAccount();
        scanner.close();
    }
}
