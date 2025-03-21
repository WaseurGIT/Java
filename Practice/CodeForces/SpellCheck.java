import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            if(n != 5){
                System.out.println("NO");
                continue;
            }

            char[] correctName = {'T','i','m','u','r'};
            char[] givenName = name.toCharArray();
            Arrays.sort(correctName);
            Arrays.sort(givenName);

            if(Arrays.equals(correctName, givenName)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

        sc.close();
    }
}
