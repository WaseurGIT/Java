package AccessModifier;

public class Child extends Parent{

    Child(){
        super();
        System.out.println("This is child constructor");
    }

    // override
    void sound(){
        System.out.println("Child cant bark");
    }

    public static void main(String[] args) {
        Child ch = new Child();
 
        System.out.println("Value of y:"+ch.y);
        System.out.println("Value of a:"+ch.a);
        System.out.println("Value of z:"+ch.z);
        // System.out.println("Value of x:"+ch.x);   -->x is private variable 

        System.out.println("Value of Pi "+ch.PI);
        

    }
}
