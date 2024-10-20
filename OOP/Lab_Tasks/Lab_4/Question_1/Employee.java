public class Employee {
    
    public String name;
    public int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
