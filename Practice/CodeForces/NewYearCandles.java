import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        int totalHour = 0;
        int burnedCandle = 0;

        while (a>0) {
            totalHour+=a;
            burnedCandle+=a;

            a =burnedCandle/b;
            burnedCandle = burnedCandle%b;
        }
        System.out.println(totalHour);
        sc.close();
    }
}
