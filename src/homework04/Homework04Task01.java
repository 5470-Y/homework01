package homework04;

public class Homework04Task01 {
    public static void main(String[] args) {

        /*### Задача на FOR

        Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд*/

        int value = 0; // цена за 1 кг // Можно было объявить в for
        for (int count  = 1; count <= 10; count++) {
            value +=2; // Можно обновлять в for
            System.out.print(value + " ");
        }
    }
}
