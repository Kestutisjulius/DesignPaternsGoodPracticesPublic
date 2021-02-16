package design_patterns.creational.builder;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {   //cia gali atkeliauti betkokia RobotBuilder implementacija
        this.robotBuilder = robotBuilder;
    }
    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    //magija
    public void constructRobot(){
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotBody();
        robotBuilder.buildRobotHands();
        robotBuilder.buildRobotLegs();
    }
}

