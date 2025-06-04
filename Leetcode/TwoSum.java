import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("target:");
        int target = sc.nextInt();

        for (i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                System.out.println("[" + i + ", " + (i+1) + "]");
                return;
            }
        }
    }
}