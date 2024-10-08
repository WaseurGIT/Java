package Solve_1b;

//extends Class_C to avoid ambiguity problem
public class Class_E implements Class_C , Class_D {

    public void showA(){
        System.out.println("Good luck intake 50!!! from class E" );
    }
    public static void main(String[] args) {

        Class_E e = new Class_E();
        e.showA();
    }
}
