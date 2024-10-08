package Solve_3a;

abstract public class Store {

    abstract int get_price();
    abstract void display_info();

    public void showItem(){
        System.out.println("Items are available now");
    }
}
