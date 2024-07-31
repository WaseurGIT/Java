package MiniProject;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNumber = (int) (Math.random() * 100);
        int userNumber;

        do {
            System.out.println("Guess my number(1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Correct Number!!!");
                break;
            } 
            else if (userNumber > myNumber) {
                System.out.println("You Thinks Too Much Bigger");
            }
            else {
                System.out.println("Think Bigger");
            }
        } while (userNumber >= 0);
        
        System.out.print("My number was: ");
        System.out.println(myNumber);
        
        sc.close();
    }
}
