package darbas_grupese.grupePC;

public class Monitor {
    private int size;
    private String brand;
    private int totalPrice;

    public Monitor(int size, String brand, int totalPrice) {
        this.size = size;
        this.brand = brand;
        this.totalPrice = totalPrice;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
