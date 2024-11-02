import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cost1 = n * a;

        int specialTicketNeeds = n/m;   
        int specialTicketNeedsCost = specialTicketNeeds * b;
        int rideLeft = n%m;
        int rideLeftCostA = rideLeft * a;
        int rideLeftCostB = b;

        int cost2 = specialTicketNeedsCost + Math.min(rideLeftCostA, rideLeftCostB);

        // if(cost1<cost2){
        //     System.out.println(cost1);
        // }
        // else{
        //     System.out.println(cost2);
        // }
        int minCost = Math.min(cost1, cost2);
        System.out.println(minCost);
        sc.close();
    }
}
