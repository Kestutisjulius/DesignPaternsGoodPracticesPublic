package design_patterns.behavioral.strategy.jumping;

public class HighJumping implements JumpingBehavior{
    @Override
    public void jump() {
        System.out.println("Jump HIGH");
    }
}
