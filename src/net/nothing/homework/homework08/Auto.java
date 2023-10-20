package net.nothing.homework.homework08;

public class Auto extends Vehicle {
    private String color = "белый";

    public Auto(String vehicleNumber, int maxSpeed) {
        super(vehicleNumber, 240);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void repair() {
        this.repair();
        return;
    }


}
