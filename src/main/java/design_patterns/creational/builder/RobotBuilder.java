package design_patterns.creational.builder;

/**
 * Apsirasome standartinius veiksmus skirtus robotui sukurti
 */
public interface RobotBuilder {

    void buildRobotHead();
    void buildRobotBody();
    void buildRobotLegs();
    void buildRobotHands();
    Robot getRobot();
}
