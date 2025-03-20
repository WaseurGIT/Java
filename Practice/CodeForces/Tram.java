    import java.util.Scanner;

    public class Tram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int i, countPassenger = 0, tramCapacity = 0;
            for (i = 0; i < n; i++){
                
                int a = sc.nextInt();
                int b = sc.nextInt();

                countPassenger -= a;
                countPassenger += b;
                
             
                tramCapacity = Math.max(countPassenger, tramCapacity);
                
            }

            System.out.println(tramCapacity);
            sc.close();
        }
    }
