package good_pratctices.solid;

public class Plane implements GroundVehicle {

    /**
     * SOLID
     *
     * I - INTERFACE SEGREGATION PRINCIPLE
     *
     * do not define interfaces that have multiple methods
     * i.e. in implementations only part is overwritten
     * the interface has too much responsibility
     * split the "big" interface into several smaller ones
     *
     *
     *
     */
    @Override
    public void carSpecificBehavior() {

    }

    @Override
    public void accelerate() {
        System.out.println("acceleration...");

    }

    @Override
    public void brake() {
        System.out.println("Reducing speed");

    }

    @Override
    public void fly() {
        System.out.println("Fly...");

    }
}
