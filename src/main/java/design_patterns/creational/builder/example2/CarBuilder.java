package design_patterns.creational.builder.example2;

public interface CarBuilder {
    void buildBodyStyle();
    void buildPower();
    void buildEngine();
    void buildBreaks();
    void buildSeats();
    void buildWindows();
    void buildFuelType();
     Car getCar();
}
