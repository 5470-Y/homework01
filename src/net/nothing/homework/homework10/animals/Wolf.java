package net.nothing.homework.homework10.animals;

import java.util.Arrays;
import java.util.Objects;

public class Wolf extends WildAnimal{
    private final String[] likeToEat;
    private final String color;

    public Wolf(String[] likeToEat, String color) {
        this.likeToEat = likeToEat;
        this.color = color;
    }

    @Override
    public String toString() {
        return Arrays.toString(likeToEat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        String oLikeToEatAsString = Arrays.toString(likeToEat).toLowerCase();
        String wolfLikeToEatAsString = Arrays.toString(likeToEat).toLowerCase();
        return oLikeToEatAsString.equals(wolfLikeToEatAsString)
                && Objects.equals(color, wolf.color)
                && Objects.equals(getStrength(), wolf.getStrength())
                && Objects.equals(getAge(), wolf.getAge())
                && Objects.equals(getName(), wolf.getName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color);
        result = 31 * result + Arrays.hashCode(likeToEat);
        return result;
    }
}
