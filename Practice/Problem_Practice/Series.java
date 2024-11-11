package Problem_Practice;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int dif1 = num2 - num1;
        int dif2 = num3 - num2;

        if(dif1 == dif2){
            int newNumber = num3 + dif1;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
