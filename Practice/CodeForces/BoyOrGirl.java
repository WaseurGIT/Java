import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        sc.close();

        HashSet<Character> distinctChar = new HashSet<>();

        for(char i: n.toCharArray()){
            distinctChar.add(i);
        }
        if(distinctChar.size() %2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        
    }
}
