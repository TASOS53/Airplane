package Airplane;

public class EquipmentCompartment extends PrivateCompartment
{

    @Override
    protected void readyCheck() {
        System.out.println(this.description + "Equipment Compartment OK!");
    }

    @Override
    protected void process(Employee employee) {
        employee.workOn(this);
    }
    
}
