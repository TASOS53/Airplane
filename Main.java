package Airplane;

import java.lang.Thread;

public class Main {

    int x[] = new int[99999999];

    public static void main(String[] args) {
        

            try {
                System.out.println("About to sleep");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            Main main = new Main();

            try {
                System.out.println("About to sleep");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Exiting...");
            
            
    }

    
}
