import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;

        for(int i=0;i<n;i++){
            String command = sc.next();

            if(command.contains("++")){
                x++;
            }
            else if(command.contains("--")){
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
