package net.nothing.homework.homework08;

public class Homework08 {
    public static void main(String[] args) {
        Bicycle bicycle01 = new Bicycle("518557", 45, 2, "Городской");
        bicycle01.increaseAmortizing(3);
        bicycle01.repair();

        Train train01 = new Train(20, false, "45v34", 300);
        train01.increaseAmortizing(3);
        train01.repair();

        Auto auto01 = new Auto("d222dw", 240);
        auto01.amortizing = 3;
        /* Пока не нашла как выйти из бесконечного цикла.
        break не подходит в функции, а c return и без него переполнение:src/
        Exception in thread "main" java.lang.StackOverflowError
        at net.nothing.homework.homework08.Auto.repair(Auto.java:19)*/
        auto01.repair();
        System.out.println(auto01.amortizing + ", " + auto01.maxSpeed + ", " + auto01.vehicleNumber + ", " + auto01.getColor());;

        Vehicle vehicle = new Bicycle("435f", 15, 2, "Городской");
        Bicycle bVehicle02 = (Bicycle) vehicle;

    }
}
