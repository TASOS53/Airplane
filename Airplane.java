package Airplane;

public class Airplane extends Object
{
    String description;
    String title;
    int capacity;
    int passengerCompartmentCount;
    EquipmentCompartment equipmentCompartment;
    CargoBay[] cargoBays = new CargoBay[3]; 


    public void process(Employee employee)
    {
        employee.workOn(equipmentCompartment);
        for (CargoBay cargobay : cargoBays)
            employee.workOn(cargobay);
    }

    public void readyCheck()
    {
        equipmentCompartment.readyCheck();
        for (CargoBay cargobay : cargoBays)
            cargobay.readyCheck();

    }


}
