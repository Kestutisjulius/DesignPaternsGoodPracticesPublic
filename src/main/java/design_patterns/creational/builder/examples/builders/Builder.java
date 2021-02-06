package design_patterns.creational.builder.examples.builders;

import design_patterns.creational.builder.examples.cars.CarType;
import design_patterns.creational.builder.examples.components.Engine;
import design_patterns.creational.builder.examples.components.GPSNavigator;
import design_patterns.creational.builder.examples.components.Transmission;
import design_patterns.creational.builder.examples.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
