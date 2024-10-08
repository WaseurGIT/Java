public class Child extends Parent {
    public void display() {
        super.display();
        // num = 30; // Remove this line as num is final
        System.out.println("This is in Child");
    }

    public void test() {

        this.display();

        System.out.println("variable in Child: " + this.num);
        System.out.println("variable in Parent: " + super.num);

        // if num is private in parent class
        // System.out.println("variable in Child: " + this.getNum());
        // System.out.println("variable in Parent: " + super.getNum());
    }

    public static void main(String args[]) {
        Child obj = new Child();

        obj.test();
    }
}