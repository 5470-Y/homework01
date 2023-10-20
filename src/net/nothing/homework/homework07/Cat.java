package net.nothing.homework.homework07;

public class Cat {
    String name = "Мурзик";
    int weight;
    int wins = 0;

    // Т.к. имя необязательно, отдельный конструктор на него не создаю
    public Cat(int weight) {
        this.setWeight(weight);
    }

    public Cat(int weight, String name) {
        this(weight);
        this.setName(name);
    }

    public void setName(String name) {
        if (name.replaceAll(" ", "").length() >= 3 || name == null) this.name = name;
        if (name.length() < 3) {
            throw new IllegalArgumentException("name has to have from 3 characters and more except white spaces");
        }
    }

    public void setWeight(int weight) {
        if (weight >= 1 && weight < 9){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("weight has to be in range [1; 9)");
        }
    }


    public boolean attack(Cat cat01){
        if (this == cat01)
            return true;
        if (cat01 == null)
            return false;
        if (!(cat01 instanceof Cat))
            return false;
        Cat cat02 = (Cat) cat01;
        if (this.weight > cat02.weight) {
            this.wins++;
            return true;
        }
        if (this.weight < cat02.weight) {
            cat02.wins++;
            return false;
        }
        if (this.weight == cat02.weight) {
            return false;

        }
        return true;
    }

    public int getWins() {
        return wins;
    }

}
