import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int anton = 0;
        int danik = 0;
        
        String s1 = sc.nextLine();

        for(char c:s1.toCharArray()){
            if(c == 'A'){
                anton++;
            }
            else if(c == 'D'){
                danik++;
            }
        }

        if(anton>danik){
            System.out.println("Anton");
        }
        else if(danik>anton){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
        sc.close();
    }
}
