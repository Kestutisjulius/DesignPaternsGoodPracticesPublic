package good_pratctices.solid.dependency_inversion;

public class BusinessAnalist implements Employes{
    @Override
    public void work() {
        System.out.println("Working as an Analist...");
    }
}
