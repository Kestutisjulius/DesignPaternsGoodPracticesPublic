package design_patterns.structural.facade;

public class CoolingController {
    public void setTemperatureLimit (){
        System.out.println("Setting temperature to 70C");
    }
    public void run(){
        System.out.println("Cooling...");
    }
}
