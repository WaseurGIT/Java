import java.util.Scanner;

public class StudentInfo {
    
    private String studentName;
    private int studentId;
    private int studentClass;

    //getter method is used to give the read access the private field 
    public String getStudentName (){
        return studentName;
    }
    //setter method is used to give the write access the private field 
    public void setStudentName (String studentName){
        this.studentName = studentName;
    }

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentClass (){
        return studentClass;
    }
    public void setStudentClass(int studentClass){
        this.studentClass= studentClass;
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("Student Name:"+this.studentName);
        System.out.println("Student Id:"+this.studentId);
        System.out.println("Student Class:"+this.studentClass);
    }

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Student Id: ");
        int id = scanner.nextInt();

        System.out.println("Enter Student Class: ");
        int studentClass = scanner.nextInt();

        studentInfo.setStudentName(name);
        studentInfo.setStudentId(id);
        studentInfo.setStudentClass(studentClass);

        studentInfo.displayInfo();
        scanner.close();
    }
}
