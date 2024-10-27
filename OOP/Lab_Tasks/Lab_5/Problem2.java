import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int i;

        int a[] = new int[n];

        System.out.println("Enter array: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println("The value of index " + index + " is " + a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }

        sc.close();

    }
}