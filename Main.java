package Airplane;

public class Main {

    public static void main(String[] args)
    {    
        Airplane airplane = new Airplane("Airplane_1", "Airbus 737", 100, 1) ;
        CleaningEmployee cleaningEmployee = new CleaningEmployee("Cleaner");
        MaintenanceEmployee maintenanceEmployee = new MaintenanceEmployee("Maintainer");
        SecurityEmployee securityEmployee = new SecurityEmployee("Securitor");
        airplane.process(maintenanceEmployee);
        airplane.process(cleaningEmployee);
        airplane.process(securityEmployee);
        airplane.readyCheck();
    }
}
