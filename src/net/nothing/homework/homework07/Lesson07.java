package net.nothing.homework.homework07;

import java.util.Arrays;

public class Lesson07 {
    public static void main(String[] args) {
        Author author01 = new Author(1); // Пока у типа нет никаких свойств и функционала, тк класс пустой
        System.out.println(author01.id);
        author01.id = 1; // По сути строчка не нужна, тк на 5-ой уже передали id
        author01.name = "Leo";
        author01.rating = 9.9;

        Author author02 = new Author(2, "Nikolai");
        Author author03 = new Author(3, "Peter");


        author01.getInfo();
        String info02 = author02.getInfo();
        author02.printInfo();
        author02.getInfo(null); // метод прервётся, тк проверка на null
        author03.getInfo("author03 ");
        System.out.println(author01.name);

        Book book01 = new Book("Java", 2); // конструктор по умолчанию
        /*book01.name = "";*/ // так работать с приватным модификатором не будет
        book01.setName("Анна Каренина"); // можно null, "     "
/*        book01.addAddAuthor(author01);
        book01.addAddAuthor(author02);
        book01.addAddAuthor(author03);
        System.out.println(Arrays.toString(authors));*/


        // Домашняя работа с классом Book

        Author author04 = new Author(4, "Allen B. Downey");
        Author author05 = new Author(5, "Chris Mayfield");
        Book book02 = new Book("Think Java: How to Think Like a Computer Scientist", 2);
        book02.addAddAuthor(author04);
        book02.addAddAuthor(author05);
        // Выдача выглядит так: `[net.nothing.homework.homework07.Author@49097b5d,
        // net.nothing.homework.homework07.Author@6e2c634b]`.
        // Пока не получилось поправить.
        System.out.println(book02.getAuthors());


        // Домашняя работа с классом Cat

        Cat cat01 = new Cat(5);
        Cat cat02 = new Cat(4, "ЛИС");

        cat02.setName("Ли C");
        /*System.out.println(cat02.name);*/

        cat02.setWeight(8);
        /*System.out.println(cat02.weight);*/

        cat01.attack(cat02);
        System.out.println("Кот " + cat01.name + ", побед: " + cat01.getWins());
        System.out.println("Кот " + cat02.name + ", побед: " + cat02.getWins());

    }
}
