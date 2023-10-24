package net.nothing.homework.Homework11;

public enum SolarSystem {
    MERCURY ("Меркурий", 3.33022 * Math.pow(10, 23),2439.7),
    VENUS ("Венера", 4.8675 * Math.pow(10, 24), 6051.8),
    EARTH ("Земля", 5.9726 * Math.pow(10, 24), 6371.0),
    MARS ("Марс", 6.4171 * Math.pow(10, 23), 3389.5),
    JUPITER ("Юпитер", 1.8986 * Math.pow(10, 27), 69911),
    SATURN ("Сатурн", 	5.6846 * Math.pow(10, 26), 	58232),
    URANUS ("Уран", 8.6813 * Math.pow(10, 25), 25362),
    NEPTUNE ("Нептун", 1.02409 * Math.pow(10, 26), 	24622);

    private String name;
    private double mass;
    private double radius;

    SolarSystem(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
