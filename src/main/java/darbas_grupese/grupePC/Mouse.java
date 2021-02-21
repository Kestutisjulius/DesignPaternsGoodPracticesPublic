package darbas_grupese.grupePC;

public class Mouse extends Gadget{

    private boolean isOptical;



    public Mouse(String brand, int price, boolean isOptical) {
        super(brand, price);
        this.isOptical = isOptical;
    }

    public boolean isOptical() {
        return isOptical;
    }

    public void setOptical(boolean optical) {
        isOptical = optical;
    }
}
