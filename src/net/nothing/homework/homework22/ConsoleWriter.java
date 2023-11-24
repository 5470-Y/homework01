package net.nothing.homework.homework22;

public class ConsoleWriter implements AppLogger{
    String string;
    public ConsoleWriter() {}
    public ConsoleWriter(String string) {}

    public void log(String string) {
        System.out.println(string);
    };
}
