package Airplane;

public abstract class PlaneComponent extends Object
{
    protected String description;
    
    protected String getDescription() {return this.description;}; 

    protected abstract void readyCheck();
    protected abstract void process(Employee employee);

}
