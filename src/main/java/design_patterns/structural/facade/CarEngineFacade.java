package design_patterns.structural.facade;

public class CarEngineFacade {
    private AirFlowController airFlowController = new AirFlowController();
    private CoolingController coolingController = new CoolingController();
    private FilterSystem filterSystem = new FilterSystem();
    private FuelInjector fuelInjector = new FuelInjector();
    private Starter starter = new Starter();

    public void startEngine (){
        this.airFlowController.takeAir();
        this.coolingController.setTemperatureLimit();
        this.coolingController.run();
        this.filterSystem.turnOn();
        this.filterSystem.filter();
        this.fuelInjector.turnOn();
        this.fuelInjector.inject();
        this.starter.start();
    }
    public void stopEngine(){
        System.out.println("Engine is Stop...");
    }
}
