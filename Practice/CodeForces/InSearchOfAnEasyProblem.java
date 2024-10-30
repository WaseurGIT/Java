import java.util.Scanner;
public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean checker = false;

        for(int i = 0;i<n;i++){
            int option = sc.nextInt();
            if(option == 1){
                checker =true;
                break;
            }
        }

        if(checker){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }

        sc.close();
    }
}
