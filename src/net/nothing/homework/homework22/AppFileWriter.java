package net.nothing.homework.homework22;

import java.io.IOException;
import java.nio.file.*;

public class AppFileWriter implements AppLogger{
    String string;
    public AppFileWriter() {}

    public void log(String string) {
        try {
            Files.writeString(Paths.get("file-name.txt"), "данные", StandardOpenOption.APPEND);
            // "данные" будут записаны в конец (StandardOpenOption.APPEND) файла "file-name.txt"
        } catch (
                IOException e) {
            System.out.println("Данные не были записаны");
        }
    }

}


