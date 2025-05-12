import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int oppositeDice = 7 - n;
        System.out.println(oppositeDice);
    }
}
