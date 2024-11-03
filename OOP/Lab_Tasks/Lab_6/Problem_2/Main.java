package Problem_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character ch = new Character();

        try{
            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Class Type: ");
            String classType = sc.nextLine();

            System.out.println("Enter Level: ");
            int level = sc.nextInt();

            ch.createCharacter(name, classType, level);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
