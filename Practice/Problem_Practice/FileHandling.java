import java.io.File;  
import java.io.IOException;   
public class FileHandling {
    public static void main(String[] args) {
        try{
            File f = new File("E:\\FileFromJava.txt");
            if (f.createNewFile()) {
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
