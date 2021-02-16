package design_patterns.behavioral.strategy.punching;

public class StrongPunching implements PunchingBehavior{
    @Override
    public void punch() {
        System.out.println("Strong punch");
    }
}
