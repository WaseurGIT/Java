public class Child implements Parent{
    
    public void print(){
        System.out.println("Country Name: "+countryName);
    }
    public int add(){
        return x+y;
    }

    public void display(){
        System.out.println("This is a class and it implements an interface named Parent");
    }
}
