package good_pratctices.solid;

public interface GroundVehicle {

    void carSpecificBehavior();
    void accelerate();
    void brake(); // reduce speed.
    void fly(); //segragete interface methods. This fly should belong to another interface.

}
