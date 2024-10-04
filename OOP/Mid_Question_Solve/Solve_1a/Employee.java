package Solve_1a;

public class Employee {

    private String name;
    private int salary;

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary : "+salary);
    }



}
