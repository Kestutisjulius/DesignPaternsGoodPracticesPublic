package design_patterns.creational.builder;

public class OldRobotBuilder implements RobotBuilder{

    //Composition
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Surudijusi galva");
    }

    @Override
    public void buildRobotBody() {
        robot.setRobotBody("Surudijes kunas");

    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Surudijusios kojos");

    }

    @Override
    public void buildRobotHands() {
        robot.setRobotHands("Surudijusios rankos");

    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
