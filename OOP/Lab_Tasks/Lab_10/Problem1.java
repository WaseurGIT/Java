import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();

        String[] s2 = s1.split(" ");
        Map <String, Integer> map = new HashMap<>();

        for(String s : s2) {
            if(map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            }
            else{
                map.put(s, 1);
            }
        }
        System.out.println(map);
        sc.close();
    }
}