public class BankAccount {
    
    private double balance;
    
    public BankAccount(double balance){
        this.balance = balance;
    }
    
    public void withdraw(double amount)throws InsufficientFundsException,NegativeAmountException{
        if(balance<amount){
            throw new InsufficientFundsException("Withdraw amount can not be big than balance");
        }
        else if(amount<0){
            throw new NegativeAmountException("Withdraw amount can not be negative");
        }
        balance-=amount;
        System.out.println("After withdraw new Balance: "+balance);
    }
    public double getBalance(){
        return balance;
    }
    
}