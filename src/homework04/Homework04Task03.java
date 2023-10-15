import java.util.Scanner;

public class Homework04Task03 {
    public static void main(String[] args) {
        /*
        ### Задача на использование любого цикла (выберите сами)

        1. Программа загадывает число в диапазоне [1;9]
        2. Пользователь вводит число с клавиатуры
        3. Программа в зависимости от введенного числа выводит в консоль следующее:
        1) "загаданное число больше"
        2) "загаданное число меньше"
        3) "Вы угадали" (программа завершает работу)
        4. Если введен 0, вывести "выход из программы" (программа завершает работу)*/

        int min = 1;
        int max = 9;
        int hiddenNumber = (int) (Math.random() * (max - min) + min);
        int guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадано число в диапазоне [1; 9]. Попробуйте его угадать.");
        System.out.println("Для выхода из программы наберите 0.");
        do {
            System.out.println("Введите число:");
            guess = scanner.nextInt();
            if (guess == 0) {
                System.out.println("Программа завершена.");
                break;
            } else if (guess < hiddenNumber) {
                System.out.println("Загаданное число больше");
            } else if (guess > hiddenNumber) {
                System.out.println("Загаданное число меньше");
            } else {System.out.println("Вы угадали!");}
        } while (!(guess == hiddenNumber));
    }
}