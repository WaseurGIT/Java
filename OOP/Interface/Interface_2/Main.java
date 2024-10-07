public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        child.display();
        child.print();
        
        System.out.println("Sum is: "+child.add());
    }
}
