public class BankAccount {

    private int accountNumber;

    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    
    public void calculateInterest(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Calculating Interest!!!");
    }
}
