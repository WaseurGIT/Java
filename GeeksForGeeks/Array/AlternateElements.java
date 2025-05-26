import java.util.Scanner;

public class AlternateElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int i;
        for( i =0; i< 5;i++){
            arr[i] = sc.nextInt();
            sc.close();
        }
        
        for(i = 0;i<5;i+=2){
            System.out.println(arr[i]);
        }
    }
}