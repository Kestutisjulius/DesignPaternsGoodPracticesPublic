package good_pratctices.solid;

import java.time.LocalDate;

/**
 * Solid
 * <p>
 * L - LISKOV'S SUBSTITUTION PRINCIPLE
 * <p>
 * if Class A is a subtype of classB.
 * then we should be able to replace B with A without disrupting the behavior of the program.
 */
public class Main {
    public static void main(String[] args) {

        InspectionService inspectionService = new InspectionService();
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Volvo");
        vehicle.setModel("Xc90");
        vehicle.setLicensePlate("SDA999");
        vehicle.setFabricationDate(LocalDate.of(2018, 1, 1));
        vehicle.setLastInspectionDate(LocalDate.of(2019, 1, 1));

        inspectionService.executeAnnualInspection(vehicle);
        System.out.println("**");
        inspectionService.executeAnnualInspection(vehicle);

        Car car = new Car();

        car.setBrand("Audi");
        car.setModel("Aq5");
        car.setLicensePlate("SDA123");
        car.setFabricationDate(LocalDate.of(2015,01,01));
        car.setLastInspectionDate(LocalDate.of(2017,01,01));
        car.setNumberOfDoors(4);
        System.out.println("****");
        inspectionService.executeAnnualInspection(car);
        System.out.println("****");
        inspectionService.executeAnnualInspection(car);

    }
}
