import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateDirectory_1 {
    public static void main(String[] args) {

        // to create a directory
        File dir = new File("Java_Directory_1");
        dir.mkdir();  // directory created 

        String dirPath = dir.getAbsolutePath(); // to see the directory path
        System.out.println(dir.getName()); //  to see the directory name
        

        //to create a file inside a directory
        File file1 = new File(dirPath+"\\hello.txt" );

        try {
            file1.createNewFile();
            System.out.println("File created successfully");
        } 
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }


        // ** uncomment this to delete the file **
        // file1.delete();
        
        // ** uncomment this to delete the directory **
        // if(dir.delete()){
        //     System.out.println("Directory deleted");
        // }

        // ** uncomment this to check is the file exists or not **
        // if (file1.exists()) {
        //     System.out.println("File exists");
        // }

        // to write something inside a file

        try {
            Formatter formatter = new Formatter(dirPath+"\\hello.txt");
            formatter.format("%s\r\n", "Hello World!!!");
            formatter.format("%s\r\n", "Learning java ");
            formatter.format("%s\t\n", "Watching video in Youtube of Anisul Islam ");
            formatter.format("%s","Bangladesh University of Business and technology");
            formatter.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        }

        // to see the context of a file
        System.out.println("\nContent of a file:");
        try {
            Scanner sc = new Scanner(file1);
            while (sc.hasNext()){
                String s1 = sc.next();
                System.out.print(s1+" ");
                sc.close();
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: "+e);
        }
    }
}
