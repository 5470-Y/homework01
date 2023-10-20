package net.nothing.homework.homework08;

public class Train extends Vehicle{
        private int carsNumber;
        private boolean climateСontrol;

        public Train(int carsNumber, boolean climateСontrol, String vehicleNumber, int maxSpeed) {
            super(vehicleNumber, maxSpeed);
            this.carsNumber = carsNumber;
            this.climateСontrol = climateСontrol;
        }

        public void invertedClimateControl(){
        climateСontrol = !climateСontrol;
    }

        public int getCarsNumber() {
        return carsNumber;
    }

        public void setCarsNumber(int carsNumber) {
        this.carsNumber = carsNumber;
    }

        public boolean isClimateСontrol() {
        return climateСontrol;
    }

        @Override // Аннотация времени компиляции (обязательна по код-конвеншн)
        public void repair(){ // это как у родителя. Можно поменять модификатор (public),  но выше public ничего нет. Сужать нельзя, расширять можно.
            if (carsNumber > 0 && carsNumber < 7) {
                if (amortizing >= 2) amortizing -= 2;
                else amortizing--;
            } else {
                if (amortizing > 0) amortizing--;
                // если нужно использовать метод родителя, можно написать
                // super.repair();
            }
        }
}
