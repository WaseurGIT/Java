import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String players = sc.nextLine();
        sc.close();
        int count = 0;

        for(int i=1;i<players.length();i++){
            if(players.charAt(i) == players.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
            if(count>=7){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        
    }
}
