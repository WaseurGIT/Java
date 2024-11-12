import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        AgeValidation obj1 = new AgeValidation();
        
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age: ");
            
            int age = sc.nextInt();
            obj1.ageCalculate(age);
            sc.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
