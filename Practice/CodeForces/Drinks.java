import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        double sum = 0;

        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
            sum+=array[i];
        }

        double average = sum/n;
        System.out.println(average);
        sc.close();
    }
}
