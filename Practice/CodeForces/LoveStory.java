import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s1 = "codeforces";

        for(int i=0;i<n;i++){
            String s2 = sc.nextLine();

            int count = 0;

            for(int j=0;j<10;j++){
                if(s2.charAt(j)!=s1.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
