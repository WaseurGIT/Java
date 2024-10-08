public class Child extends Parent {
    public void display() {
        // num = 30; // Remove this line as num is final
        System.out.println("This is in Child");
    }

    public void test() {
        Child ob = new Child();

        ob.display();

        System.out.println("variable in Child: " + ob.num);
        System.out.println("variable in Parent: " + super.num);
    }

    public static void main(String args[]) {
        Child obj = new Child();

        obj.test();
    }
}