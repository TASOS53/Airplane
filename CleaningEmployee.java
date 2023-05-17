package Airplane;

public class CleaningEmployee extends Employee
{

    public CleaningEmployee(String name){this.name = name;};
    @Override
    protected void workOn(PlaneComponent planeComponent)
    {
        if(planeComponent instanceof PassengerCompartment || planeComponent instanceof CargoBay)
        {
            System.out.println("Cleaning Employee " + this.name + "about to work on " + planeComponent.getDescription());
            planeComponent.readyCheck();
            this.report();
        }
    }

    @Override
    protected void report() {
        System.out.println("Cleaning Employee " + this.name + ":" + "Cleaning OK!");
    }
    
}
