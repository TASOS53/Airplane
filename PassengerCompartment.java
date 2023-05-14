package Airplane;


public class PassengerCompartment extends PlaneComponent
{
    PassengerCompartment internalPassengerCompartment;

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
        employee.workOn(internalPassengerCompartment);
    }


}
