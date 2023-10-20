package net.nothing.homework.homework08;

public class KickScooter extends Bicycle {
    private boolean isElectric;


    public KickScooter(String vehicleNumber, int maxSpeed, int wheelsNumber, String bicycleType, boolean isElectric) {
        super(vehicleNumber, maxSpeed, wheelsNumber, bicycleType);
        this.isElectric = isElectric;
    }

    public void repair() {
        if (amortizing > 2 && !isElectric) {
            amortizing -= 3;
        } else if (amortizing > 1 && isElectric) {
            amortizing -= 2;
        } else this.repair(); // if (amortizing > 0) amortizing--; // this.repair();


    }
}
