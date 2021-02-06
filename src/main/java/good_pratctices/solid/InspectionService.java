package good_pratctices.solid;

import java.time.LocalDate;

//Inspection Service
public class InspectionService {
    public void executeAnnualInspection(Vehicle vehicle) {
        System.out.println("Inspecting vehicle " + vehicle.getBrand() + " " + vehicle.getModel());

        if (vehicle.isInspectionOverdue()){
            System.out.println("WARNING --time overdue");


        }

        executeInspectorDuties();

        vehicle.setLastInspectionDate(LocalDate.now());
    }

    private void executeInspectorDuties() {
        //Operations executed by inspector

        System.out.println("Checking breaks"); // gali but nauja klase
        System.out.println("Checking exhaustion"); // gali but nauja klase
        System.out.println("Checking oil"); //gali but nauja klase
    }
}
