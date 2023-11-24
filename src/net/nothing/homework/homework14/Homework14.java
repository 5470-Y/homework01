package net.nothing.homework.homework14;

import java.io.Serializable;

public class Homework14 {
    public static void main(String[] args) {

        // 2. Создать экземпляр `PairContainer`, где key - любые числа, value - строка
        PairContainer<Integer, String> pairContainer02 = new PairContainer<>(5616541, "Контейнер");

        // 3. Создать экземпляр `PairContainer`, где key - строка, value - тип User, у которого id - любые числа
        User<Integer> user03 = new User<>(54151);
        PairContainer<Integer, User<Integer>> pairContainer03 = new PairContainer<>(51465, user03);

        // 4. Создать экземпляр `PairContainer`, где key - строка, value - тип PairContainer,
        // у которого key - любые числа, value - тип User, у которого id - строка
        User<String> user04 = new User<>("654");
        PairContainer<Integer, User<String>> pairContainer = new PairContainer<>(5654, user04);
        PairContainer<String, PairContainer<Integer, User<String>>> pairContainer04 = new PairContainer<>("51465", pairContainer);


        // ### Задание 2

        interface Eatable extends Serializable {
        }
        interface Runnable {
        }

        class Animal implements Runnable {
        }

        class Cat extends Animal implements Eatable {
        }
        class Kitten extends Cat {
        }

        class Dog extends Animal implements Serializable {
        }


        class Task {
            public static <T extends Cat & Eatable> void void01(T object) {
                // ВОПРОС: методы каких типов можно вызвать у object ???
                // Можно вызвать методы типа Cat, Kitten
            }

            public static <T extends Animal & Serializable> void void02(T object) {
                // ВОПРОС: методы каких типов можно вызвать у object ???
                // Методы типа Dog, Cat, Kitten
            }

            public static <T extends Serializable & Runnable> void void03(T object) {
                // ВОПРОС: методы каких типов можно вызвать у object ???
                // Методы типов, которые одновременно имплементируют названные интерфейсы, т.е.
                // методы типа Dog, Cat, Kitten
            }

           /* public static void main(String[] args) {
                Task.<*//* ВОПРОС: какие типы можно указать ??? *//*>void01(*//* ВОПРОС: какие типы можно передать ??? *//*);
                // Указать Сat, KItten
                // Передать типы класса Cat, Kitten
                Task.<*//* ВОПРОС: какие типы можно указать ??? *//*>void02(*//* ВОПРОС: какие типы можно передать ??? *//*);
                // Можно указать Dog, Cat, Kitten
                // Можно передать Dog, Cat, Kitten
                Task.<Dog>void03(*//* ВОПРОС: какие типы можно передать ??? *//*);
                //  Можно передать Dog
            }*/


        }
    }
}
