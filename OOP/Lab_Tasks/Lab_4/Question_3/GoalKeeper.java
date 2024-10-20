package Question_3;

public class GoalKeeper implements PlayerAction{

    public void shoot() {
        System.out.println("Shoot: Goalkeeper shoots the ball");
    }

    public void passBall() {
        System.out.println("Pass Ball: Goalkeeper pass the ball but its not his main job");
    }

    public void defend() {
        System.out.println("Defend: Goalkeepers main job is goalkeeping!");
    }

}
