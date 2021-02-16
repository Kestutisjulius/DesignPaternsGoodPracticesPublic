package design_patterns.behavioral.strategy.jumping;

public class LowJump implements JumpingBehavior{
    @Override
    public void jump() {
        System.out.println("LOW jumping");
    }
}
