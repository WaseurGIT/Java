import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(10210.3);
        
        try{
            System.out.println("Enter withdraw amount: ");
            Scanner sc = new Scanner(System.in);
            double n = sc.nextDouble();
            obj.withdraw(n);
            sc.close();
        }
        catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
        
    }
}
