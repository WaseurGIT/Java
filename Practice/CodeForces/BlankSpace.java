import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] array = new int[n];

            for(int j=0 ; j<n;j++){
                array[j] = sc.nextInt();
            }

            int maxBlankSpace=0;
            int currentBlankSpace=0;

            for(int value:array){
                if(value == 0){
                    currentBlankSpace++;

                }
                else{
                    maxBlankSpace = Math.max(maxBlankSpace, currentBlankSpace);
                    currentBlankSpace=0;
                }
            }
            maxBlankSpace=Math.max(maxBlankSpace, currentBlankSpace);
            System.out.println(maxBlankSpace);
        }
        sc.close();
    }
}
