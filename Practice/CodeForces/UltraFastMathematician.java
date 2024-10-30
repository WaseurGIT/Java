import java.util.Scanner;
public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bin1 = sc.nextLine();
        String bin2 = sc.nextLine();

        for(int i=0;i<bin1.length();i++){
            if(bin1.charAt(i)!=bin2.charAt(i)){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        sc.close();
    }
}
