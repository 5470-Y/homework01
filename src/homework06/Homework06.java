package homework06;

import java.lang.StringBuilder;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;

public class Homework06 {
    public static void main(String[] args) {

        /*### Задача #1
        Дана строка, содержащая только буквы и цифры.
        Вывести информацию о том, является ли данная трока палиндромом.*/


        // Т.к. по задаче нет пробелов, то их удаление не делала
        String text = "4Nn4";
        StringBuilder stringBuilder = new StringBuilder(text);
        boolean isPalindrome = text.equalsIgnoreCase(stringBuilder.reverse().toString());
        // Короткий вариант вывода
        System.out.println("Строка является палиндромом: " + isPalindrome);
        // Вариант вывода подлиннее, но первый мне нравится больше, тк без if
        if (isPalindrome) System.out.println("Строка является палиндромом");
        else System.out.println("Строка не является палиндромом");


        /*### Задача #2

        Даны две строки, строки, содержащие только буквы английского алфавита.
        Вывести информацию о том, являются ли одна строка анаграммой другой строки.*/

        String string1 = "Thing";
        String string2 = "night";
        char[] letters1 = string1.toLowerCase(Locale.ENGLISH).toCharArray();
        char[] letters2 = string2.toLowerCase(Locale.ENGLISH).toCharArray();
        Arrays.sort(letters1);
        Arrays.sort(letters2);
        // Короткий вариант вывода
        System.out.println("Строки являются анаграммами: " + Arrays.equals(letters1, letters2));
        // Вариант вывода подлиннее, но первый мне нравится больше, тк без if
        if (Arrays.equals(letters1, letters2)) {
            System.out.println("Строки " + string1.toString() + " и " + string2.toString() + " являются анаграммами");
        } else {System.out.println("Строки" + string1.toString() + " и " + string2.toString()
                + " не являются анаграммами");};








    }
}
