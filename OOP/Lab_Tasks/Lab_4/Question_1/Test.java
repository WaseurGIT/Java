public class Test {
    public static void main(String[] args) {
        Employee obj1 = (Employee) new Manager("Nana", 120000, 5);
        Employee obj2 = (Employee) new Developer("Colnel", 120000, "Java");
    
        obj1.display();
        obj2.display();
    }
    
}