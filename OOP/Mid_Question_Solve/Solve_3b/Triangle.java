package Solve_3b;

public class Triangle extends Shape {

    public void display_area() {
        double area = 0.5 * getA() * getB();
        System.out.println("Area of triangle : " + area);
    }
}
