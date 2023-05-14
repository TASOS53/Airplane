package Airplane;

public class CargoBay extends PrivateCompartment
{
    private EquipmentCompartment equipmentCompartment;

    @Override
    protected void readyCheck() {
        System.out.println(this.description + "Cargo Bay OK!");
    }

    @Override
    protected void process(Employee employee) {
        employee.workOn(this);
    }


}
