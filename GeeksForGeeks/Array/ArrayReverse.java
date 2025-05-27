import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] arr = new int[5];
        int[] reversedArray = new int[5];
        int i;

        for(i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            reversedArray[i] = arr[4 - i];
        }

        System.out.println(Arrays.toString(reversedArray));


    }
}
