import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int i, width = 0;
        for (i = 0; i < n; i++){
            int f = sc.nextInt();

            if(f > h){
                width += 2;
            }
            else{
                width += 1;
            }
        }

        System.out.println(width);
        sc.close();
    }
}
