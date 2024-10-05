package Lab_1.Solve5;

public class Customer {

    private String name;
    private int customerId, bankAccount;

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Bank Account : " + bankAccount);
    }
}
