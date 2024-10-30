import java.util.Scanner;
import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine().toLowerCase();

        HashSet<Character> uniqueLetters = new HashSet<>();

        for(char c : word.toCharArray()){
            if(c>='a' && c<='z'){
                uniqueLetters.add(c);
            }
        }

        if(uniqueLetters.size()==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
