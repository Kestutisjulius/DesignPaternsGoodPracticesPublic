package darbas_grupese.grupeKMIShiping;

public class ByWater implements Shipping{
    @Override
    public void Ship() {
        System.out.println("Delivered by water");
    }
}
