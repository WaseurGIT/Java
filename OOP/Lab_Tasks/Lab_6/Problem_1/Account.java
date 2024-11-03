package Problem_1;

public class Account {

    private String accountNumber;
    private double balance;

    Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void Withdraw(double amount){
        if(amount>balance){
            throw new IllegalArgumentException("Withdraw amount should be less than balance");
        }
        else if(amount<0){
            throw new IllegalArgumentException("Withdraw Amount can't be negative or less than zero");
        }
        balance-=amount;
    }

    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    
}