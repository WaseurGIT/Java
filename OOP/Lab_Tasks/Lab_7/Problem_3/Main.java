import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box<Object> obj3 = new Box<>();
        
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        obj3.setName(name);

        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        obj3.setId(id);

        System.out.println("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        obj3.setCgpa(cgpa);
        
        System.out.println("Name: "+obj3.getName());
        System.out.println("Id: "+obj3.getId());
        System.out.println("CGPA: "+obj3.getCgpa());
        sc.close();
    }
}
