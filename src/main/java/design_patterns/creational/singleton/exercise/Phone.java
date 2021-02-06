package design_patterns.creational.singleton.exercise;

import java.time.LocalDate;

public class Phone implements MobilePhone{
    private String brand;
    private Color color;
    private Integer price;
    private LocalDate madeDate;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public LocalDate getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(LocalDate madeDate) {
        this.madeDate = madeDate;
    }

    @Override
    public void wifiRange() {
        System.out.println("noWIFI");
    }
}
