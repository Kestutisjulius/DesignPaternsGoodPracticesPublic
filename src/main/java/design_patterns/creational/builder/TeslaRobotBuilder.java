package design_patterns.creational.builder;

public class TeslaRobotBuilder implements RobotBuilder {
    private Robot robot;
    public TeslaRobotBuilder() {
        this.robot = new Robot();
    }
    @Override
    public void buildRobotHead() {
    }
    @Override
    public void buildRobotBody() {
    }
    @Override
    public void buildRobotLegs() {
    }
    @Override
    public void buildRobotHands() {
    }
    @Override
    public Robot getRobot() {
        return robot;
    }
}