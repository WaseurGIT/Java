import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        sc.close();

        double distX =  Math.pow(x2 - x1, 2);
        double distY =  Math.pow(y2 - y1, 2);


        double distance = Math.sqrt(distX + distY);
        System.out.println(distance);
    }
}
