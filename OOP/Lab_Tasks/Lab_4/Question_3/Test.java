package Question_3;

public class Test {
    public static void main(String[] args) {
        
        PlayerAction obj1 = new Striker();
        PlayerAction obj2 = new Midfielder();
        PlayerAction obj3 = new GoalKeeper();

        System.out.println("\nStriker:");
        obj1.passBall();
        obj1.shoot();
        obj1.defend();

        System.out.println("\nMidfielder:");
        obj2.passBall();
        obj2.shoot();
        obj2.defend();

        System.out.println("\nGoalkeeper:");
        obj3.passBall();
        obj3.shoot();
        obj3.defend();

    }
}
