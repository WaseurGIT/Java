import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        Map <Character, Integer> map = new HashMap<>();

        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);

            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch, count+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        sc.close();
    }
}