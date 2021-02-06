package good_pratctices.solid.dependency_inversion;

/**
 * SOLID
 *
 * D - Dependency Inversion principle
 *
 * Higher level modules should not be dependant on Lower Level Modules.
 *
 * Instead both higher and lower level modules should be dependant on abstractions.
 *
 * Manager - higher level module
 * Developer - lower level module
 */
public class Manager {
    private Employes employee;
    public void setEmployee(Employes employee) {
        this.employee = employee;
    }
    public void manage() {
        employee.work();
    }
}