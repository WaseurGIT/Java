package Problem_2;

public class Character {
    private String name;
    private String classType;
    private int level;

    public void createCharacter(String name, String classType, int level){
        this.name = name;
        this.classType = classType;
        this.level = level;

        if(name.isEmpty()){
            throw new IllegalArgumentException("Name is required");
        }
        if(!classType.equalsIgnoreCase("warrior") && !classType.equalsIgnoreCase("mage")){
            throw new IllegalArgumentException("class type does not matched");
        }
        if(level<1 && level>100){
            throw new IllegalArgumentException("Choose level between 1 to 100");
        }

        System.out.println("Name: "+name);
        System.out.println("Class Type: "+classType);
        System.out.println("Level: "+level);
    }
}
