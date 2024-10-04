package Solve_1a;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Abdul", 100, 4);
        Developer developer = new Developer("Motin", 1200, "Java");

        manager.displayInfo();
        developer.displayInfo();
    }
}
