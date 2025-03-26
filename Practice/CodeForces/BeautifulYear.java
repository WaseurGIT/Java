import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        sc.close();

        
        while (true) {
            year++;
            String yearStr = String.valueOf(year);
            HashSet<Character> distinctYear = new HashSet<>();

            boolean unique = true;
            for (char ch : yearStr.toCharArray()) {
                if (!distinctYear.add(ch)) {
                    unique = false;
                    break;
                }
            }
            if(unique){
                System.out.println(year);
                break;
            }
        }
    }
}
