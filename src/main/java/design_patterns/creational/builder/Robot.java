package design_patterns.creational.builder;

public class Robot implements RobotPlan{

   //galetu buti atskitos klases dalims.
    private String head;
    private String body;
    private String legs;
    private String hands;

    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    @Override
    public void setRobotBody(String body) {

        this.body = body;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs = legs;

    }

    @Override
    public void setRobotHands(String hands) {
        this.hands = hands;

    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", legs='" + legs + '\'' +
                ", hands='" + hands + '\'' +
                '}';
    }
}
