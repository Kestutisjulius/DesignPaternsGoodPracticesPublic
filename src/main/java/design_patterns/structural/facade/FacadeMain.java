package design_patterns.structural.facade;

/**
 * Facade hides the complexity from the client and exposes only access to it.
 * Eg. House or Restaurant or Car.
 */
public class FacadeMain {

    public static void main(String[] args) {


        AirFlowController airFlowController = new AirFlowController();
        CoolingController coolingController = new CoolingController();
        FilterSystem filterSystem = new FilterSystem();
        FuelInjector fuelInjector = new FuelInjector();
        Starter starter = new Starter();

        //this is a complexity which we need to simplify for the client.
        airFlowController.takeAir();
        coolingController.setTemperatureLimit();
        coolingController.run();
        filterSystem.turnOn();
        filterSystem.filter();
        fuelInjector.turnOn();
        fuelInjector.inject();
        starter.start();

        System.out.println("**********");
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();

    }
}
