import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }


        int dif1 = a[1] - a[0];
        int dif2 = a[2] - a[1];

        if(dif1 == dif2){
            int newNumber = a[n-1] + dif1;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
