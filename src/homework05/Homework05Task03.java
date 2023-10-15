package homework05;

import java.util.Scanner;
import java.util.Arrays;

public class Homework05Task03 {
    public static void main(String[] args) {

        /*### Задача #3

        Заполните массив на `len` элементов (размер массива вводит пользователь) случайным целыми числами и выведете
        максимальное, минимальное и среднее арифметическое значение элементов массива.*/


        // Если поставить диапазон [-2_147_483_648; 2_147_483_647],
        // при таком вычислении значений для массива: a + (int) (Math.random() * (b - a + 1)),
        // все значения в массиве получаются отрицательные. И среднее значение будто некорректно.
        // Почему так?


        System.out.println("Предлагается создать массив. Задайте его длину");
        int a = 0;
        int b = 10_000_000;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] randoms = new int[len];
        for (int i = 0; i < randoms.length; i++) {
            /*randoms[i] = (int) (Math.random() * (b - a + 1) + a);*/
            randoms[i] = a + (int) (Math.random() * (b - a));
            sum += randoms[i];
        }
        System.out.println(Arrays.toString(randoms));
        Arrays.sort(randoms);
        System.out.println("Минимальное значение в массиве: " + randoms[0]);
        System.out.println("Максимальное значение в массиве: " + (randoms[randoms.length - 1]));
        System.out.println("Среднее значение в массиве: " + (((double) sum) / randoms.length));


    }
}




