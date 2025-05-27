import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int i;
        int firstMax = 0;
        int secondMax = 0;

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }

        for (i = 0; i < 5; i++) {
            if (arr[i] != firstMax && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondMax);
        }
    }
}
