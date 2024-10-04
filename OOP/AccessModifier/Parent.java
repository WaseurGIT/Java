package AccessModifier;

public class Parent {
    private int x = 5;          // private variable: access only within the class
    public int y = 10;          // public variable: access from everywhere
    int z = 12;                 // default variable: package private, accessible is same package
    protected int a = 15;       // protected variable: accessible within same package and subclass 

    final double PI = 3.14;     //final used to declare fixed values, can not reinitialize the value  

    int getValue() {            // used to access the private variable publicly
        return x;
    }

    //constructor: will be called automatically when object is created 
    Parent(){
        System.out.println("This is parent constructor");
    }

    //static function
    static void display(){
        System.out.println("This is a static method, it does not need any object to call");
    }


    void sound(){
        System.out.println("Dog can barks");
    }



    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("The value of x = " + parent.getValue());
        System.out.println("The value of y = "+ parent.y);
        System.out.println("The value of z = "+ parent.z);
        System.out.println("The value of a = "+ parent.a);

        //calling the static method
        Parent.display();
    }
}