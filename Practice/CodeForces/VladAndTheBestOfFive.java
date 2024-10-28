import java.util.Scanner;

public class VladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();

            int countA = 0;
            int countB = 0;

            for (char ch : s.toCharArray()) {
                if (ch == 'A') {
                    countA++;
                } 
                else if (ch == 'B') {
                    countB++;
                }
            }

            if (countA > countB) {
                System.out.println("A");
            } 
            else {
                System.out.println("B");
            }
        }
        sc.close();
    }
}
