package Question_3;

public class Midfielder implements PlayerAction {

    public void passBall() {
        System.out.println("Pass Ball: Midfielder pass the ball towards the teammates!");
    }

    public void defend() {
        System.out.println("Defend: Midfielder also defend the ball from opposition");
    }

    public void shoot() {
        System.out.println("Shooting: Midfielder make a good pass for the striker");
    }

}
