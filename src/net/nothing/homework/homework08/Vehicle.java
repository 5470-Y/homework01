package net.nothing.homework.homework08;

public class Vehicle {
    protected String vehicleNumber;  // null // заменяем public
    protected int amortizing; // 0
    protected int maxSpeed = 120; // так можно задать значение по умолчанию. Необязательно через констурктор

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Vehicle(String vehicleNumber, int maxSpeed) {
        this(vehicleNumber);
        this.maxSpeed = maxSpeed;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAmortizing() {
        return amortizing;
    }



    public void increaseAmortizing(int value){
        if (value < 0) return;
        amortizing += value;
    }

    public void repair(){
        if (amortizing > 0) {
            amortizing--;
            return;
        }


    }
}
