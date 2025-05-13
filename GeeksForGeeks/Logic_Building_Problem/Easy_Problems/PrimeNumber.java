    import java.util.Scanner;

    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            sc.close();

            boolean isPrime = true;

            if(a <= 1){
                isPrime=false;
            }
            else{
                for(int i = 2;i<= Math.sqrt(a);i++){
                    if(a % i == 0){
                        isPrime=false;
                        break;
                    }
                }
            }

            if(isPrime){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
