import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int i;
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target :");
        int t = sc.nextInt();
        
        for (i = 0; i < 5; i++) {
            if (arr[i] == t) {
                System.out.println("At index: " + i);
                break;
            }
            else{
                System.out.println("Invalid Item not in the array");
                break;
            }
        }
        
        
        sc.close();

    }
}
