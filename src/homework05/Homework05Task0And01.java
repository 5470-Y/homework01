package homework05;

import java.util.Arrays;

public class Homework05Task0And01 {
    public static void main(String[] args) {

        /*### Задание #0
        Разобрать методы класса `java.util.Arrays` и ответить на вопросы:
        1. Чем метод `Arrays.equals(...)` отличается от метода `Arrays.compare(...)`?
        2. Для чего используется метод `Arrays.mismatch(...)`?*/

        /*1. Отличие метода `Arrays.equals(...)` от метода `Arrays.compare(...)`
        -   `Arrays.equals(...)`возвращает булево значение. Массивы либо равны (true), либо не равны (false);
        -   `Arrays.compare(...)` сравнивает массивы лексикографически:
            - если первый массив меньше второго, результат сравнения < 0);
            - если первый массив равен второму, результат равен 0;
            - если первый массив больше второго, результат > 0.
        2. `Arrays.equals(...)` выводит индекс, с которого начинается несоответствие двух массивов.
        Если массивы равны, т.е. несовпадений нет, вернётся -1.
        * */



        /*### Задача #1

        Объявить массив целых чисел. Длина массива - 15.
        Заполнить массив четными числами в диапазоне [10, 100).
        Для заполнения массива использовать цикл.*/

        int[] numbers = new int[15];
        int boundary = 10;

        // Вариант 1.
        // 1 цикл
        for (int i = 0; (i < numbers.length) && (boundary < 100); i++, boundary++) {
            if (boundary % 2 != 0) boundary++;
            if (boundary % 2 == 0) {
                numbers[i] = boundary;
            }
        }
        System.out.println(Arrays.toString(numbers));

        //Вариант 2
        // 2 цикла
        for (int i = 0; (i < numbers.length) && (boundary < 100); i++, boundary++) {
            for (int j = 1; j < i; j++) {
                if (boundary % 2 == 0) {
                    numbers[i] = boundary;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
