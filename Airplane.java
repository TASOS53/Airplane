package Airplane;

public class Airplane extends Object
{
    private String description;
    private String title;
    private int capacity;
    private int passengerCompartmentCount;
    private EquipmentCompartment[] equipmentCompartments;
    private PassengerCompartment[] passengerCompartments;
    private CargoBay cargoBay; 
   

    Airplane(String description, String title, int capacity, int passengerCompartmentCount)
    {
        this.description = description;
        this.title = title;
        this.capacity = capacity;
        this.passengerCompartmentCount = passengerCompartmentCount;
        
        passengerCompartments = new PassengerCompartment[passengerCompartmentCount];
        for (int i=0; i<passengerCompartmentCount; ++i)
            passengerCompartments[i] = new PassengerCompartment("Airplane PassengerCompartment_" + i);

        equipmentCompartments = new EquipmentCompartment[3];
        for (int i=0; i<3; ++i)
            equipmentCompartments[i] = new EquipmentCompartment("Airplane EquipmentCompartment_" + i);

        //for (EquipmentCompartment e : equipmentCompartments)  this approach does not work until you initialize each element of the equipementCompartments array first!!!
        //    e = new EquipmentCompartment("AAA");

        cargoBay = new CargoBay("CargoBay1", "CargoBay EquipmentCompartment");
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getPassengerCompartmentCount() {
        return passengerCompartmentCount;
    }

    public void readyCheck()
    {
        cargoBay.readyCheck();
        
        for (EquipmentCompartment equipmentCompartment : equipmentCompartments)
            equipmentCompartment.readyCheck();

        for (PassengerCompartment passengerCompartment : passengerCompartments)
            passengerCompartment.readyCheck();

        System.out.println("Airplane ready to take off!");
    }

    public void process(Employee employee)
    {
        employee.workOn(cargoBay);
        for (EquipmentCompartment equipmentCompartment : equipmentCompartments)
            employee.workOn(equipmentCompartment);
        for (PassengerCompartment passengerCompartment : passengerCompartments)
            employee.workOn(passengerCompartment);
    }

    

}

