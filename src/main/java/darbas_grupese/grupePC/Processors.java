package darbas_grupese.grupePC;

public class Processors {
    private String brand;
    private int proce;

    public Processors(String brand, int proce) {
        this.brand = brand;
        this.proce = proce;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProce() {
        return proce;
    }

    public void setProce(int proce) {
        this.proce = proce;
    }

    @Override
    public String toString() {
        return "Processors{" +
                "brand='" + brand + '\'' +
                ", proce=" + proce +
                '}';
    }
}
