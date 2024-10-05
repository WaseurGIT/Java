package OOP.StudyMaterials;

public class Pen {
    // String color;
    // String type;
    // int price;

    // public void penColor(){
    // System.out.println("Color: "+this.color);
    // }

    // public void penType(){
    // System.out.println("Type: "+this.type);
    // }

    // public void penPrice(){
    // System.out.println("Price: "+this.price);
    // }

    private String color, type;
    private int price;

    public String brandName;
    public int year; 

    // the get method is used to access the private variables in the class,
    // here getColor is used to access the color variable
    public String getColor() {
        return color;
    }

    // the set method is used to set the value in the private variables in the class
    // here setColor is used to set value in the color variable
    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // non parametrized constructor
    // Pen(){
    //     System.out.println("Constructor of Pen class");
    // }

    Pen(String brandName, int year){
        this.brandName = brandName;
        this.year = year;
        System.out.println("Brand Name: "+this.brandName);
    }

    public void displayPen(){
        System.out.println("Pen Color : "+color);
        System.out.println("Pen Type : "+type);
        System.out.println("Pen Price : "+price);
    }
}
