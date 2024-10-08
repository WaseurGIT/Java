package Solve_3a;

public class Bookstore extends Store {

    private int price;
    private String bookName;

    public Bookstore(int price, String bookName){
        this.price = price;
        this.bookName = bookName; 
    }
    int get_price(){
        return price;
    };
    void display_info(){
        System.out.println("The name of the book is : "+bookName+ ",The price is: "+ price+"$");
    };
}
