package darbas_grupese.grupePC;

public class Klavetura extends Gadget{
    private String language;


    public Klavetura(String brand, int price, String language) {
        super(brand, price);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Klavetura{" +
                "language='" + language + '\'' +
                "} " + super.toString();
    }
}
