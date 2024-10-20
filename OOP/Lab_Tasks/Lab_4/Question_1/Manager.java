public class Manager extends Employee {
    
    public int teamSize;

    public Manager(String name, int salary, int teamSize){
        super(name, salary);
        this.teamSize = teamSize;
    }

    public void display(){
        super.display();
        System.out.println("Team Size: "+teamSize);
    }
}
