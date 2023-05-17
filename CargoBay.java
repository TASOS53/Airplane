package Airplane;

public class CargoBay extends PrivateCompartment
{
    private EquipmentCompartment equipmentCompartment;

    CargoBay(String cargoBayDescription, String equipmentCompartmentDescription)
    {
        this.description = cargoBayDescription;
        equipmentCompartment = new EquipmentCompartment(equipmentCompartmentDescription);
    }

    public EquipmentCompartment getEquipmentCompartment() {
        return equipmentCompartment;
    }

    /*@Override
    protected String getDescription() {
        return super.getDescription();
    }*/

    @Override
    protected void readyCheck() {
        System.out.println(this.description + "Cargo Bay OK!");
    }

    @Override
    protected void process(Employee employee) {
        employee.workOn(this);
    }


}
