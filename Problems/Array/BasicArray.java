package Array;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myArray[] = new int[5];

        int i;
        for(i=0;i<myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        System.out.println("kaka");
        for(i=0;i<myArray.length;i++){
            System.out.println(""+myArray[i]);
        }
        
    }
}
