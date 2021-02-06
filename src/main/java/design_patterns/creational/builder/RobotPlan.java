package design_patterns.creational.builder;

//Roboto kurimo instrukcija aprasyta interface
public interface RobotPlan {

    void setRobotHead(String head);
    void setRobotBody(String body);
    void setRobotLegs(String legs);
    void setRobotHands(String hands);
}
