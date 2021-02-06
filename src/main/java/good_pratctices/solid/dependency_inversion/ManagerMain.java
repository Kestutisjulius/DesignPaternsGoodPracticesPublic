package good_pratctices.solid.dependency_inversion;

public class ManagerMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setEmployee(new Developer());
        manager.manage();
        manager.setEmployee(new Architect());
        manager.manage();

        manager.setEmployee(new BusinessAnalist());
        manager.manage();

        manager.setEmployee(new Tester());
        manager.manage();
    }
}
