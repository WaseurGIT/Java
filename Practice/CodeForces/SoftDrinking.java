import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrinks = k * l;
        int totalSlices = c * d;
        int salt = p;

        int toastsByDrink = totalDrinks / (n * nl);
        int toastsBySlice = totalSlices / n;
        int toastsBySalt = salt / (n * np);

        int toasts = Math.min(toastsByDrink, Math.min(toastsBySlice, toastsBySalt));
        System.out.println(toasts);
        sc.close();
    }
}
