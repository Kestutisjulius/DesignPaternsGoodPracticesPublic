package design_patterns.behavioral.strategy.model;


import design_patterns.behavioral.strategy.jumping.JumpingBehavior;
import design_patterns.behavioral.strategy.punching.PunchingBehavior;

//superclass
public class Fighter {
    //Fighter can jump and Punch

    PunchingBehavior punchingBehavior;
    JumpingBehavior jumpingBehavior;

    public Fighter(PunchingBehavior punchingBehavior, JumpingBehavior jumpingBehavior) {
        this.punchingBehavior = punchingBehavior;
        this.jumpingBehavior = jumpingBehavior;
    }

    public Fighter(PunchingBehavior punchingBehavior) {
        this.punchingBehavior = punchingBehavior;
    }

    public void punch(){
        punchingBehavior.punch();
    }
    public void jump(){
        jumpingBehavior.jump();
    }

}
