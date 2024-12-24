import java.util.Scanner;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            String s1 = sc.nextLine();
            int hour = Integer.parseInt(s1.substring(0, 2));
            String min = s1.substring(3);

            String period = (hour<12) ? "AM" : "PM";

            hour = (hour % 12 == 0) ? 12 : hour % 12;
            
            System.out.printf("%02d:%s %s%n", hour, min, period);
        }
        sc.close();
    }
}
