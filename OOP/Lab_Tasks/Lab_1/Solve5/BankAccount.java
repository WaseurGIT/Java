package Lab_1.Solve5;

public class BankAccount {

    private int accountNumber, balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: " + amount);
        } else {
            System.out.println("Deposit amount can not be zero");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

}
