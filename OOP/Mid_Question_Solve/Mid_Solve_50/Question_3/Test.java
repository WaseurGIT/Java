public class Test {
    public static void main(String[] args) {
        
        BankUtils obj1 = new BankUtils();
        obj1.display();

        BankAccount obj2 = new BankAccount(2);
        obj2.calculateInterest();

        Transaction obj3 = new Transaction();
        obj3.processesTransaction();
    }
}
