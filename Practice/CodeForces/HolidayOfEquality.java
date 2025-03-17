 import java.util.Scanner;

public class HolidayOfEquality {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // citizen number
        int n = sc.nextInt();
        
        // citizens money
        int[] money = new int[n];

        int i, max = 0, sum = 0;

        for(i = 0; i< n; i++){
            money[i] = sc.nextInt();
        }

        max = money[0];

        for(i = 0; i<n ; i++){
            if (max < money[i]){
                max = money[i];
            }
        }

        for (i = 0;i < n;i ++){
            sum += max - money[i]; 
        }

        System.out.println(sum);
        sc.close();
    }

}
