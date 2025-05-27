import java.util.Scanner;

public class LargeThreeDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int i;
        int first = 0, second=0, third = 0;

        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(i=0;i<n;i++){
            int num = arr[i];
            if(num>first){
                if(num!=first){
                    third = second;
                    second = first;
                    first = num;
                }
            }
            else if(num > second && num != first){
                third = second;
                second = num;
            }
            else if(num > third && num != first && num != second){
                third = num;
            }
        }

        System.out.println(first);
        if (second !=Integer.MIN_VALUE)
            System.out.println(second);
        if (third != Integer.MIN_VALUE)
            System.out.println(third);
     
            sc.close();
    }
}
