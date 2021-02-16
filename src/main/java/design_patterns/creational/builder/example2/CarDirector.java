package design_patterns.creational.builder.example2;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarBuilder getCarBuilder() {
        return carBuilder;
    }
    public void constructCar(){
        carBuilder.buildBodyStyle();
        carBuilder.buildEngine();
        carBuilder.buildPower();
        carBuilder.buildBreaks();
        carBuilder.buildSeats();
        carBuilder.buildWindows();

    }
}
