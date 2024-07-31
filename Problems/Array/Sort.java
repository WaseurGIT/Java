package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int marks[] = new int[5];

        System.out.println("Enter numbers: ");
        for(i=0;i<marks.length;i++){
            marks[i] = scanner.nextInt();
        }

        Arrays.sort(marks);

        System.out.println("Sorted marks: ");
        for(i=0;i<marks.length;i++){
            System.out.println(""+marks[i]);
        }

    }
}
