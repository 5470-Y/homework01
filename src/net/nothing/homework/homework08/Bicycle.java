package net.nothing.homework.homework08;

public class Bicycle extends Vehicle{
    private int wheelsNumber = 2;
    private String bicycleType = "Городской";


    public Bicycle(String vehicleNumber, int maxSpeed, int wheelsNumber, String bicycleType) {
        super(vehicleNumber, maxSpeed);
        this.wheelsNumber = wheelsNumber;
        this.bicycleType = bicycleType;
    }


    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public String getBicycleType() {
        return bicycleType;
    }
}
