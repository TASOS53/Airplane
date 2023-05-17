package Airplane;

public class MaintenanceEmployee extends Employee
{

    public MaintenanceEmployee(String name){this.name = name;};
    
    @Override
    protected void workOn(PlaneComponent planeComponent) {
        if(planeComponent instanceof PrivateCompartment)
        {
            System.out.println("Maintainance Employee: " + this.name + "about to work on " + planeComponent.getDescription());
            planeComponent.readyCheck();
            this.report();
        }
    }

    @Override
    protected void report() {
        System.out.println("Maintainance Employee " + this.name + ":" + "Maintainance OK!");

    }
    
}
