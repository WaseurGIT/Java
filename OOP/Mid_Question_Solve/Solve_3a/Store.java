package Solve_3a;

abstract public class Store {
    abstract void get_price();
    abstract void display_info();

    public void showItem(){
        System.out.println("Non abstract method from abstract class Store");
    }
}
