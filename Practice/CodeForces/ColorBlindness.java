import java.util.Scanner;

public class ColorBlindness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            sc.nextLine();

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            String str1 = s1.replace('G', 'X').replace('B', 'X');
            String str2 = s2.replace('G', 'X').replace('B', 'X');

            if(str1.equals(str2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
