import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String players = sc.nextLine();
        sc.close();
        
        if(players.contains("0000000") || players.contains("1111111")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
