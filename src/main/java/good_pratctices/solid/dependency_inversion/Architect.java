package good_pratctices.solid.dependency_inversion;

public class Architect implements Employes{
    @Override
    public void work(){
        System.out.println("Architect working...");
    }
}
