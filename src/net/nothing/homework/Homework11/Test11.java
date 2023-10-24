package net.nothing.homework.Homework11;

public class Test11 {
    public static void main(String[] args) {
        System.out.println(SolarSystem.EARTH);
        System.out.println(SolarSystem.MARS.name());
        System.out.println(SolarSystem.JUPITER.getMass());
        System.out.println(SolarSystem.VENUS.ordinal());
        System.out.println("Планета " + SolarSystem.SATURN.getName() + " имеет массу " + SolarSystem.SATURN.getMass()
                + " кг и средний радиус " + SolarSystem.SATURN.getRadius() + " км");

    }
}
