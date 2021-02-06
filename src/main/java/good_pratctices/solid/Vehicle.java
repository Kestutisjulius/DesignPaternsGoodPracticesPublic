package good_pratctices.solid;

import java.time.LocalDate;
import java.time.Period;

/**+
 * SOLID
 *
 * Single Responsibility (viena atsakomybe)
 *
 * Class should have only one responsibility
 *
 */
public class Vehicle {
    //fields
    private String brand;
    private String model;
    private LocalDate fabricationDate;
    private String licensePlate;
    private LocalDate lastInspectionDate;

    //method
    public  boolean isInspectionOverdue(){
        LocalDate currentTime = LocalDate.now();
        Period timeSinceLastInspection = Period.between(lastInspectionDate, currentTime);
        int differenceInYears = timeSinceLastInspection.getYears();

        return  differenceInYears >= 1 ? true : false;

//        if (differenceInYears >= 1) {
//            return true;
//        }
//        return false;
    }









    //setter's & getter's


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public LocalDate getLastInspectionDate() {
        return lastInspectionDate;
    }

    public void setLastInspectionDate(LocalDate lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
    }
}
