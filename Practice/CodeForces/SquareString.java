import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i<n;i++){
            String s1 = sc.nextLine();

            if(s1.length()%2==0){
                int half = s1.length()/2;
                String firstHalf = s1.substring(0, half);
                String secondHalf = s1.substring(half);

                if(firstHalf.equals(secondHalf)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
