package Strings;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = "Cansu Dere";
        String complement = "an actress";
        

        String fullName = firstName+" "+complement;
        System.out.println("Fullname: "+fullName);

        System.out.println(fullName.charAt(0));
        System.out.println(fullName.length());
        System.out.println(fullName.replace('D','d'));
        System.out.println(fullName.substring(0,5));
        scanner.close();
    }    
}
