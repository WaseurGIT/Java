public class Box <T>{
    private T name;
    private T id;
    private T cgpa;
    
    public T getName(){
        return name;
    }
    
    public void setName(T name){
        this.name = name;
    }
    public T getId(){
        return id;
    }
    
    public void setId(T id){
        this.id = id;
    }
    public T getCgpa(){
        return cgpa;
    }
    
    public void setCgpa(T cgpa){
        this.cgpa = cgpa;
    }
}