package homework04;

import java.util.Scanner;

public class Homework04Task02 {
    public static void main(String[] args) {

/*
        ### Задача на WHILE

        Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int keybordInput;
        int sum = 0;
        if ((keybordInput = scanner.nextInt()) > 0) {
            do {
                sum += (keybordInput % 10);
                keybordInput /= 10;
            } while  (keybordInput > 0);
            System.out.println("Сумма цифр вашего числа: " + sum);
            System.exit(0);
        } else System.out.println("Значение не является целым положительным числом. Перезапустите программу.");
        System.exit(0);

    }




}