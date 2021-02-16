package design_patterns.behavioral.strategy;

import design_patterns.behavioral.strategy.jumping.LowJump;
import design_patterns.behavioral.strategy.model.Fighter;
import design_patterns.behavioral.strategy.punching.StrongPunching;

/**
 * Strategy pattern defines a family of algorithms.
 * Eg. jumping and Pushing are the main actions for the fighter.
 * Those actions should be encapsulated.
 * Those actions should be interchangeable.
 * In that case we can change the behavior without affecting the client.
 */
public class StrategyMain {
    public static void main(String[] args) {

        Fighter fighter = new Fighter(new StrongPunching(), new LowJump());

        fighter.jump();
        fighter.punch();
    }

}
