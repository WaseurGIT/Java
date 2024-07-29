package BeeCrowd;

import java.util.Scanner;
import java.lang.Math;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c,e,f;

        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();

        e = (a+b+Math.abs(a-b))/2;
        f = (e+c+Math.abs(e-c))/2;

        System.out.println(f+" eh o maior");        
        
        scanner.close();
    }
}
