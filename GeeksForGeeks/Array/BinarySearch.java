import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int i, low=0, high = n-1;
        System.out.println("Enter sorted values");
        for(i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target : ");
        int x = sc.nextInt();

        while (low<=high) {
            int mid = (low + high)/2;

            if(arr[mid] == x){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
    }
}
