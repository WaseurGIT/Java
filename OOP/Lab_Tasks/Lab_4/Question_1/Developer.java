public class Developer extends Employee {
    
    public String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage){
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void display(){
        super.display();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
