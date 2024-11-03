import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i<n;i++){
            
            String line = sc.nextLine();
            String[] words = line.split(" ");
            String a = words[0];
            String b = words[1];
            
            String firstWord = b.charAt(0)+a.substring(1);
            String secondWord = a.charAt(0)+b.substring(1);
        
            System.out.println(firstWord+" "+secondWord);
        }
        sc.close();
    }
}
