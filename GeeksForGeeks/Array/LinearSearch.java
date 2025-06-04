import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int i;
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;

        System.out.println("Enter the target :");
        int t = sc.nextInt();

        sc.close();
        
        for (i = 0; i < 5; i++) {
            if (arr[i] == t) {
                System.out.println("At index: " + i);
                flag = true;
                break;
            }
        }

        if(flag == false){
            System.out.println("Invalid Item not in the array");
        }
            


    }
}
