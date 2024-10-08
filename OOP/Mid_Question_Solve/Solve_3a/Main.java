package Solve_3a;

public class Main {
    public static void main(String[] args) {
        Store bookstore = new Bookstore(200,"Opekkha");
        Store ricestore = new Ricestore(150,"Bash Moti");

        bookstore.showItem();
        bookstore.display_info();

        System.out.println();

        ricestore.showItem();
        ricestore.display_info();
    }
}
