package Solve_3a;

public class Ricestore extends Store {
    
    private int ricePrice;
    private String riceType;

    public Ricestore(int ricePrice, String riceType){
        this.ricePrice = ricePrice;
        this.riceType = riceType;
    }

    
    int get_price(){
        return ricePrice;
    };

    void display_info(){
        System.out.println("The rice type is: "+riceType + ", The price is: "+ricePrice+"$");
    };
}
