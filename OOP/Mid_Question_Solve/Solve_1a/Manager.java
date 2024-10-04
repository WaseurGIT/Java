package Solve_1a;

public class Manager extends Employee {
    private int teamSize;

    public int getTeamSize(){
        return teamSize;
    }

    Manager(String name, int salary, int teamSize){
        super(name, salary);
        this.teamSize = teamSize;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team size : "+teamSize);
    }


    
}
