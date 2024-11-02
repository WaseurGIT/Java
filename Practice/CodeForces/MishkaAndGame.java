import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mishkaCount = 0;
        int chrisCount =0;

        for(int i = 0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a>b){
                mishkaCount++;
            }
            else if(b>a){
                chrisCount++;
            }
        }
        if(mishkaCount>chrisCount){
            System.out.println("Mishka");
        }
        else if(mishkaCount<chrisCount){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}
