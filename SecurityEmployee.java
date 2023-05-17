package Airplane;

public class SecurityEmployee extends Employee {

    public SecurityEmployee(String name){this.name = name;};
    
    @Override
    protected void workOn(PlaneComponent planeComponent)
    {
        System.out.println("Security Employee: " + this.name + "about to work on " + planeComponent.getDescription());
        planeComponent.readyCheck();
        this.report();
    }

    @Override
    protected void report() {
        System.out.println("Security Employee " + this.name + ":" + "Security OK!");
        
    }

    
}
