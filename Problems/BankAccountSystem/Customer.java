package BankAccountSystem;

import java.util.Scanner;

public class Customer {

    private String name;
    private int customerId;
    private int bankAccount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayCustomerInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("CustomerId: " + this.customerId);
        System.out.println("Bank Account: " + this.bankAccount);
    }

    public void depositMoney(int amount) {
        this.bankAccount += amount;
        System.out.println("Deposit: " + this.bankAccount);
    }

    public void withdrawMoney(int amount) {
        if (this.bankAccount >= amount) {
            this.bankAccount -= amount;
            System.out.println("Withdrawal:" + this.bankAccount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Your Id: ");
        int customerId = scanner.nextInt();
        
        System.out.println("Enter Your BankAccount: ");
        int bankAccount = scanner.nextInt();
        
        System.out.println("Enter the amount of deposit : ");
        int depositMoney = scanner.nextInt();
        
        System.out.println("Enter the amount of withdraw : ");
        int withdrawMoney = scanner.nextInt();

        customer.setName(name);
        customer.setCustomerId(customerId);
        customer.setBankAccount(bankAccount);

        customer.displayCustomerInfo();

        customer.depositMoney(depositMoney);
        customer.withdrawMoney(withdrawMoney);
        
        scanner.close();
    }
}
