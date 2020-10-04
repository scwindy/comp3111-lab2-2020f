package comp3111.lab2.ex2;

public class MobileComputer extends Computer implements Chargeable{
    private int battery;
    public MobileComputer() {
        secret = "MobileComputer secret";
        battery = 5;
    }

    @Override
    public void work() {
        if (battery > 0) {
            System.out.println("It is working on my lap.");
            battery--;
        } else
            System.out.println("Running out of battery");
    }

    @Override
    public void charge() {
        if (battery < 10)
            System.out.println("Charge this mobile computer");
        battery++;
    }

    //Explanation of the fix:
    //As we are implementing the charge function using the interface "Chargrable", we have to
    //explicitly mention that we are implementing it at the first line of the class definition
}
