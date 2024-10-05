public class Cat implements Animal{

    public void bark(){
        System.out.println("Cat can not bark");
    }

    public void organ(){
        System.out.println("Cat has 4 legs , 2 eyes and ears");
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();

        c1.bark();
        c1.organ();
    }
    
}
