public class Cat implements Animal{

    public void bark(){
        System.out.println("Cat can not bark");
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();

        c1.bark();
    }
    
}
