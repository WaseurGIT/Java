import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int step = n/5;
        if (n%5!=0){
            step+=1;
        }
        System.out.println(step);
        sc.close();
    }
}
