import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, j ,n, min, temp = 0;
        System.out.println("Enter Array Size: ");
        n= scanner.nextInt();

        int array[] = new int[n];
        System.out.println("Enter Array elements: ");
        for(i = 0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        for(i = 0;i<n-1;i++){
            min = i;
            for(j = i+1; j<n;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min!=i){
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.println("Sorted Elements: ");
        for(i = 0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        scanner.close();
    }    
}
