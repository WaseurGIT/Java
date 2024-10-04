package Solve_3b;

public class Main {
    public static void main(String[] args) {
        Shape shape;

        shape = new Triangle();
        shape.setData(6, 4);
        shape.display_area();

        shape = new Rectangle();
        shape.setData(5, 6);
        shape.display_area();

    }
}
