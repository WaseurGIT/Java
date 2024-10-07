public class Constractor1 {
    Constractor1(){
        System.out.println("Ford Mustgang, nissan GTR");
    }

    public Constractor1(int a){
        System.out.println("A : "+a);
    }

    public static void main(String[] args) {
        Constractor1 con1 = new Constractor1();
        Constractor1 con2 = new Constractor1(5);
    }
}
