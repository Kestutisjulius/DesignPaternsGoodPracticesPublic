package darbas_grupese.grupePC;

public class Gadget {
    private String brand;
    private int price;

    public Gadget(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
