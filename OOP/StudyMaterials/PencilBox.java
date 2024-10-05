package OOP.StudyMaterials;

import java.util.Scanner;

public class PencilBox {
    public static void main(String[] args) {
        // new  - it makes space in memory for object
        Pen pen1 = new Pen("econo",2002);
        Scanner sc = new Scanner(System.in);

        String color, type;
        int price;

        System.out.println("Enter Pen Color: ");
        color = sc.nextLine();
        System.out.println("Enter Pen Type: ");
        type = sc.nextLine();
        System.out.println("Enter Pen Price: ");
        price = sc.nextInt();

        pen1.setColor(color);
        pen1.setType(type);
        pen1.setPrice(price);

        pen1.displayPen();
        sc.close();

    }
}
