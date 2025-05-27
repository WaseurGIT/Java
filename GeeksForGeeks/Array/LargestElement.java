import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int i;
        int max = 0;
        
        for(i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        
        for(i = 0;i<5;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
