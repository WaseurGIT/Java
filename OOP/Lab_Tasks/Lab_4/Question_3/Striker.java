package Question_3;

public class Striker implements PlayerAction {

    public void shoot() {
        System.out.println("Shooting: Striker Shoot the ball!");
    }

    public void passBall() {
        System.out.println("Pass Ball: Striker pass the ball towards teammate");
    }

    public void defend() {
        System.out.println("Defend: This is not strikers main role");
    }
}
