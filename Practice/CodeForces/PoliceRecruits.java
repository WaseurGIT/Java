import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        
        int i, crimeCounter = 0, countOfficer = 0;
        for(i = 0; i<n ; i++){
            int e = sc.nextInt();

            if(e == -1){
                if (countOfficer>0 ){
                    countOfficer--;
                }
                else{
                    crimeCounter++;
                }
            }
            else{
                countOfficer+=e;
            }
        }


        System.out.println(crimeCounter);

        sc.close();
    }
}
