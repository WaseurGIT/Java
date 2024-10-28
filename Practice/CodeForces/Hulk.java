import java.util.Scanner;
public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        StringBuilder feelings = new StringBuilder();

        for(int i=0; i<n; i++){
            if(i%2 != 0){
                feelings.append("I hate");
            }
            else{
                feelings.append("I love");
            }
            if(i<n){
                feelings.append(" that ");
            }
            else{
                feelings.append(" it");
            }
        }

        System.out.println(feelings);
    }
}
