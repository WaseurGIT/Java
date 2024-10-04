package Solve_3a;

public class Main {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        Ricestore ricestore = new Ricestore();

        bookstore.get_price();
        bookstore.display_info();
        bookstore.showItem();

        ricestore.get_price();
        ricestore.display_info();
        ricestore.showItem();
    }
}
