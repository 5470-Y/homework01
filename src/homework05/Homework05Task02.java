package homework05;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05Task02 {
    public static void main(String[] args) {

        /*### Задача #2

        Создать два массива целых чисел на 5 элементов каждый.
        Массивы необходимо заполнять значениями в цикле. Значения вводит пользователь с клавиатуры.

        1. Если число отрицательное, добавить его в первый массив.
        2. Если число положительное, добавить его во второй массив.
        3. Программа завершает работу, когда оба массива заполнены или, если пользователь ввёл 0*/

        int[] positive = new int[5];
        int[] negative = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Есть 2 массива по 5 значений в каждом.");
        System.out.println("Один массив с отрицательными значениями, другой — с положительными.");
        System.out.println("Вводите отрицательные или положительные числа, чтобы заполнить оба массива. " +
                "Для выхода введите 0.");
        for (int i = 0, j = 0; true; ) {
            System.out.println("Ваше значение: ");
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Программа завершена.");
                break;
            }
            if (input > 0 && positive[positive.length - 1] == 0) {
                positive[i] = input;
                i++;
            }
            if (input < 0 && (negative[negative.length - 1] == 0)) {
                negative[j] = input;
                j++;
            }
            if (i == positive.length && j == negative.length) {
                System.out.println(Arrays.toString(negative));
                System.out.println(Arrays.toString(positive));
                break;
            } else continue;
        }
    }
}
