package good_pratctices.solid;

/**
 * SOLID
 *
 * O - Open for extension, Closed for modification
 *
 * Stop ourselves from modifying existing code, causing potential new bugs instead extends the class
 * to add additional functionality or features.
 */

public class Car extends Vehicle implements GroundVehicle {

    public int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void carSpecificBehavior() {

    }

    @Override
    public void accelerate() {
        System.out.println("gazuoju kaip masina");
    }

    @Override
    public void brake() {
        System.out.println("stabdau kaip masina");

    }

    @Override
    public void fly() {

    }

//    @Override
//    public boolean isInspectionOverdue() {
//        return super.isInspectionOverdue();  // // jei reikia override metoda savaip
//    }
}
