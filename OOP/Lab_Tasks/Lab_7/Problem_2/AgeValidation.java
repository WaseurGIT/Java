public class AgeValidation {

    private int age;
    
    public void ageCalculate(int age) throws UnderageException{
        if(age<18){
            throw new UnderageException("You are not mature for voting");
        }
        else{
            System.out.println("Congratulations!!!");
        }
        this.age=age;
    }
    
}