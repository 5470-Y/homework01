package net.nothing.homework.homework08;

import java.util.Random;

public class RepairDepot {
    private Train[] trains; // если объявить через дочерний класс, можно добавить только объекты этого класса
    private Vehicle[] vehicles; // если объявлять через родителя, то будут использоваться все классы
    private Bicycle[] bicycles;
    private Auto[] auto;
    private KickScooter[] kickScooters;
    private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};


/*    public void  addToVehicles(Vehicle vehicle){

    }*/
    public void repairAll(){
        for (Vehicle vehicle : vehicles) {
            vehicle.repair();
            if (vehicle instanceof Train){ // этот синтаксис можно заменить на строки 13-14
                Train t = (Train) vehicle;
                t.invertedClimateControl();
            }
            if (vehicle instanceof Train t) { // 9-11 можно заменить на это
                t.invertedClimateControl();
            }
            if (vehicle instanceof Auto a){
                Random random = new Random();
                a.setColor(colors[random.nextInt(colors.length)]);
            }
            /*2) после ремонта ссылку на транспортное средство необходимо обнулять*/
        }
    }
}
