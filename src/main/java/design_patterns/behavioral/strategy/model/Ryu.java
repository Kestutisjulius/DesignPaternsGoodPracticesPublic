package design_patterns.behavioral.strategy.model;

import design_patterns.behavioral.strategy.jumping.JumpingBehavior;
import design_patterns.behavioral.strategy.punching.PunchingBehavior;

public class Ryu extends Fighter{
    public Ryu(PunchingBehavior punchingBehavior, JumpingBehavior jumpingBehavior) {
        super(punchingBehavior, jumpingBehavior);
    }
}
