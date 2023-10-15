package homework05;

import java.util.Arrays;

public class Homework05Task04 {
    public static void main(String[] args) {


        /*### Задача #4
        Дан массив целых чисел: `int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44}`.
        Найти максимальную сумму четырёх смежных целых чисел в массиве task04.
        Использовать алгоритм скользящего окна.*/

        int[] task04 = {88, 34, 12, 55, 90, 4, 10, 44};
        int window = 4;

        // Вариант 1
        // Думаю, это решение не по методу скользящего окна. Верно?
        int[] task04Sum1 = new int[task04.length + 1 - window];
        System.out.println("Имеется следующий массив: " + Arrays.toString(task04));
        System.out.println("Требуется найти в нём максимальную сумму четырёх смежных целых чисел.");
        for (int i = 0; i < task04Sum1.length; i++) {
            for (int j = i; (j - i) < window; j++) {
                task04Sum1[i] += task04[j];
            }
        }
        System.out.println("Массив из сумм четырёх смежных чисел: " + Arrays.toString(task04Sum1));
        Arrays.sort(task04Sum1);
        System.out.println("Наибольшая сумма четырёх смежных чисел: " + task04Sum1[task04Sum1.length - 1]);

        // Вариант 2
        // Этот вариант сделала до просмотра урока, на котором разобрали как решать этим методом.
        // Не могла понять, почему у меня первые две суммы больше на одно из значений.
        // После урока поняла, что мне не хватало переменной, которая бы удаляла нижнее значение из окна.
        // А пока делала вариант 3 поняла, что для каждого варианта лучше создавать новый массив для сохранения
        // результатов.
        int[] task04Sum2 = new int[task04.length + 1 - window];
        System.out.println("Имеется следующий массив: " + Arrays.toString(task04));
        System.out.println("Требуется найти в нём максимальную сумму четырёх смежных целых чисел.");
        for (int i = 0, p = 0; (i < task04Sum2.length) && (p < window); i++, p++) {
            task04Sum2[i] += task04[p];
            if (p < (i + window)) {
                p++;
                continue;
            }
            if (p == 4) p = 0;

        }
        System.out.println("Массив из сумм четырёх смежных чисел: " + Arrays.toString(task04Sum2));
        Arrays.sort(task04Sum2);
        System.out.println("Наибольшая сумма четырёх смежных чисел: " + task04Sum2[task04Sum2.length - 1]);



        // Вариант 3
        int[] task04Sum3 = new int[task04.length + 1 - window];
        System.out.println("Имеется следующий массив: " + Arrays.toString(task04));
        System.out.println("Требуется найти в нём максимальную сумму четырёх смежных целых чисел.");
        int sum = 0;
        for (int begin = 0, end = 0; end < task04.length; end++) {
            if ((end - begin) < window) sum += task04[end];
            if ((end - begin + 1) == window) {
                task04Sum3[begin] = sum;
                sum -= task04[begin];
                begin++;
            }
        }
        System.out.println("Массив из сумм четырёх смежных чисел: " + Arrays.toString(task04Sum3));
        Arrays.sort(task04Sum3);
        System.out.println("Наибольшая сумма четырёх смежных чисел: " + task04Sum3[task04Sum3.length - 1]);
    }
}

