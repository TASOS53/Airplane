package Airplane;

public class EquipmentCompartment extends PrivateCompartment
{

    EquipmentCompartment(String description)
    {
        this.description = description;
    }

    @Override
    protected void readyCheck() {
        System.out.println(this.description + "Equipment Compartment OK!");
    }

    @Override
    protected void process(Employee employee) {
        employee.workOn(this);
    }
    
}
