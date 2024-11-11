package Problem_Practice;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s1 = sc.nextLine();
        int count = 0;
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch == 'a' || ch=='e'|| ch=='o'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println("The string contains vowel");
        System.out.println("Total vowel: "+count);
        sc.close();
    }
    
}
