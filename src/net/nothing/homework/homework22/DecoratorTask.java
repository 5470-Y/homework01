package net.nothing.homework.homework22;


public class DecoratorTask {
    public static void main(String[] args) {

        AppLogger logger01 = new Delimiter(new Upper(new ConsoleWriter()));
        logger01.log("Тест1");

        AppLogger logger02 = new Upper(new Delimiter(new AppFileWriter()));
        logger02.log("Тест2");


        ConsoleWriter console = new ConsoleWriter();
        console.log("Вывод в консоль");

        AppFileWriter file = new AppFileWriter();
        file.log("Запись в файл");


    }
}
