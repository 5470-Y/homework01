package net.nothing.homework.homework22;

public class Decorator implements AppLogger{
    AppLogger appLogger;
    String string;

    public Decorator(AppLogger appLogger) {
        this.appLogger = appLogger;
    }

    @Override
    public void log(String string) {
        appLogger.log(string);
    }
}
