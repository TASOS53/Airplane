package Airplane;


public class PassengerCompartment extends PlaneComponent
{
    PassengerCompartment internalPassengerCompartment;

    public PassengerCompartment(String description){this.description = description;};
    public PassengerCompartment(String description, PassengerCompartment interPassengerCompartment)
    {
        this(description);
        this.internalPassengerCompartment = interPassengerCompartment;
    }

    @Override
    protected void readyCheck()
    {
        System.out.println(this.description + "Passenger Compartment OK!");
        if(internalPassengerCompartment != null)
            internalPassengerCompartment.readyCheck();
    }

    @Override
    protected void process(Employee employee)
    {
        employee.workOn(this);
        if(internalPassengerCompartment != null)
            employee.workOn(internalPassengerCompartment);
    }


}
