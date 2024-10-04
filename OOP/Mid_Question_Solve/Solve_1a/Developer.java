package Solve_1a;

public class Developer extends Employee {
    private String programmingLanguage;


    Developer(String name, int salary, String programmingLanguage){
        super(name, salary);
        this.programmingLanguage= programmingLanguage;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Programming Language: "+programmingLanguage);
    }

}
