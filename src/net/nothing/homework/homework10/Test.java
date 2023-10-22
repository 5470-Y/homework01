package net.nothing.homework.homework10;

import net.nothing.homework.homework10.animals.Wolf;
import net.nothing.homework.homework10.images.Editor;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        /*Editor editor01 = new Editor();
        editor01.setDrawable(editor01.getDrawable());
        Editor editor02 = new Editor();
        editor02.setDrawable(editor02.getDrawable());*/

        String likeToEat01[] = {"Печень"};
        String likeToEat02[] = {"печень"};
        Wolf wolf01 = new Wolf (likeToEat01, "серый");
        Wolf wolf02 = new Wolf (likeToEat02, "серый");
        System.out.println("wolf01: " + Arrays.toString(likeToEat01));
        System.out.println("wolf02: " + Arrays.toString(likeToEat02));
        System.out.println(wolf01.equals(wolf02));

    }
}
