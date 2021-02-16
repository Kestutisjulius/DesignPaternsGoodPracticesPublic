package design_patterns.creational.builder.example2;

public class TestBuilderPattern {
    public static void main(String[] args) {
        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector director = new CarDirector(carBuilder);
        director.constructCar();
        Car car = carBuilder.getCar();
        System.out.println(car);

        carBuilder = new SportsCarBuilder();
        director = new CarDirector(carBuilder);
        director.constructCar();
        car = carBuilder.getCar();
        System.out.println(car);
    }
}
