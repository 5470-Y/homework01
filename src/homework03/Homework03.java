package homework03;

import org.w3c.dom.ls.LSOutput;

public class Homework03 {
    public static void main(String[] args) {

        /* Задача #1.
        Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
        в интервал (25;200) и выводить результат в консоль.
        */

        int a = 10, b = 500, c = 25, d = 200;
        int e = (int) (Math.random() * (b - a + 1) + a);
        if ((e > c) && (e < d)) {
            System.out.println("Число " + e + " содержится в интервале (" + c + "; " + d + ").");}
        else {
            System.out.println("Число " + e + " не содержится в интервале (" + c + "; " + d + ").");
        }

        /* Задача #2 на if else
        Дана переменная currentScoreValue - количество очков, набранное пользователем.
        Если пользователь набрал 90 и более очков, он занял первое место.
        Если пользователь набрал от 80 до 89, он занял второе место.
        Если пользователь набрал от 70 до 79, он занял третье место.
        Если пользователь набрал меньше 70, он не занял никакого места.
        Вывести в консоль, какое место занял пользователь.
        */

        // Вариант 1
        int currentScoreValue = 54;
        if (currentScoreValue >= 90) {
            System.out.println("Пользователь занял первое место.");
        } else if (currentScoreValue >= 80 && currentScoreValue <= 89) {
            System.out.println("Пользователь занял второе место");
        } else if (currentScoreValue >= 70 && currentScoreValue <= 79) {
            System.out.println("Пользователь занял третье место");
        } else System.out.println("Пользователь не занял никакого места");

        // Вариант 2
        int minScoreValue = 0, maxScoreValue = 100;
        int currentScoreValuePseudorandom = (int) (Math.random() * (maxScoreValue - minScoreValue + 1) + minScoreValue);
        if (currentScoreValuePseudorandom >= 90) {
            System.out.println("Пользователь занял первое место.");
        } else if (currentScoreValuePseudorandom >= 80 && currentScoreValuePseudorandom <= 89) {
            System.out.println("Пользователь занял второе место");
        } else if (currentScoreValuePseudorandom >= 70 && currentScoreValuePseudorandom <= 79) {
            System.out.println("Пользователь занял третье место");
        } else System.out.println("Пользователь не занял никакого места");

        /*Задача #3 на if else
        Даны переменные x и y - координаты точки на плоскости.
        Необходимо определить четверть координатной плоскости, которой принадлежит данная точка.
        Результат вывести в консоль.
        Если обе координаты положительны, точка принадлежит первой четверти.
        Если координата x отрицательна, а y положительна, точка принадлежит второй четверти.
        Если обе координаты отрицательны, точка принадлежит третьей четверти.
        Если координата x положительна, а y отрицательна, точка принадлежит четвёртой четверти.*/

        double x = 54.5, y = -56.0;
        if (x > 0 && y > 0) System.out.println("Точка принадлежит первой четверти");
        else if (x < 0 && y > 0) System.out.println("Точка принадлежит второй четверти");
        else if (x < 0 && y < 0) System.out.println("Точка принадлежит третьей чертверти");
        else System.out.println("Точка принадлежит четвёртой четверти");

        /*Задача #4 на switch
        Дана переменная monthNumber, которая хранит порядковый номера месяца.
        И переменная isLeap, которая хранит информацию о том, является ли год високосным.
        Написать программу, которая в зависимости от значения monthNumber выводит в консоль количество дней в этом месяце.
        Необходимо рассмотреть два случая: год не является високосным и год является високосным.*/

        boolean isLeap = true;
        int monthNumber = 2;
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("В месяце " + monthNumber + " — 31 день");
            case 4, 6, 9, 11 -> System.out.println("В месяце " + monthNumber + " — 30 дней");
            case 2 -> {
                if (!isLeap) System.out.println("В месяце " + monthNumber + " — 28 дней");
                else System.out.println("В месяце " + monthNumber + " — 29 дней");
            }
        }


        /*Задача #5 на switch
        Даны переменные couponNumber - номер купона и resultSum - сумма покупки.
        Если номер купона - 1111, скидка 10%,
        Если номер купона - 3333, скидка 20%,
        Если номер купона - 5555, скидка 30%.
        В остальных случаях скидка не предусмотрена.
        Необходимо вычислить и сохранить в переменную resultSum сумму с учетом скидки, если она предусмотрена.
        Вывести значение resultSum в консоль.
        * */

        int couponNumber = 5555;
        double resultSum = 61681.0;

        // Вариант 1
        int sale1 = switch (couponNumber) {
            case 1111 -> {System.out.println("Скидка 10%"); yield 10;}
            case 3333 -> {System.out.println("Скидка 20%"); yield 20;}
            case 5555 -> {System.out.println("Скидка 30%"); yield 30;}
            default -> {System.out.println("Скидка не предусмотрена"); yield 0;}
        };
        System.out.println(resultSum * (100 - sale1) / 100);

        // Вариант 2
        int sale2 = switch (couponNumber) {
            case 1111 -> 10;
            case 3333 -> 20;
            case 5555 -> 30;
            default -> 0;
        };
        System.out.println(resultSum * (100 - sale2) / 100);

        }

    }
