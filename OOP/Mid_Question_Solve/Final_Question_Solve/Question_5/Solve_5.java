import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Solve_5 {
    public static void main(String[] args) {
        
        try{

            // create a new file named input.txt
            File file1 = new File("input.txt");
            file1.createNewFile();

            // write something in this file
            FileWriter writeInputFile = new FileWriter("input.txt");
            writeInputFile.write("Mango\n");
            writeInputFile.write("Apple\n");
            writeInputFile.close();

            // read the content of this file
            Scanner read  = new Scanner(file1);

            // write results in output.txt file
            FileWriter writeOutputFile = new FileWriter("output.txt");
            
            // reading each line and calculate the length
            while (read.hasNextLine()){
                String line = read.nextLine();
                int len = line.length();
                writeOutputFile.write(len+"\n");
            }
            // closing the scanner and writer
            read.close();
            writeOutputFile.close();

        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}