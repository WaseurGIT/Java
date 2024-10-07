import java.util.Scanner;

public class SimpleGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Mark: ");
        int number = scanner.nextInt();

        if(number>=80){
            System.out.println("A+");
        }
        else if(number>=75 && number<80){
            System.out.println("A");
        }
        else if(number>=70 && number<75){
            System.out.println("A-");
        }
        else if(number>=65 && number<70){
            System.out.println("B+");
        }
        else if(number>=60 && number<65){
            System.out.println("B");
        }
        else if(number>=55 && number<60){
            System.out.println("C");
        }
        else if(number>=50 && number<55){
            System.out.println("C+");
        }
        else if(number>=45 && number<50){
            System.out.println("D");
        }
        else if(number>=40 && number<45){
            System.out.println("E");
        }
        else if(number<=39){
            System.out.println("F");
        }

        scanner.close();
    }
}