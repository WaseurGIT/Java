import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] friends = new int[n];
        int[] result = new int[n];
        int i;

        for(i = 0; i< n;i++){
            friends[i] = sc.nextInt();

            result[friends[i]- 1] = i + 1;

        }
        for(i = 0; i < n; i++){
            System.out.println(result[i] + " ");
        }
    }
}
