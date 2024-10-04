package AccessModifier;

public class Main extends Abstract {

    void displayAbstract(){
        System.out.println("implementation of abstract method because this is the subclass of Abstract class.");
    }
    public static void main(String[] args) {
        
        //dynamic method dispatch:- reference variable(parent) = object(child)
        Parent p = new Child();

        Main m1 = new Main();

        //calling the overridden function 
        p.sound();
        m1.displayAbstract();
    }
}
