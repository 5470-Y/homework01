package net.nothing.homework.homework07;

import java.util.Arrays;

public class Author {
    // Поля
    public long id;
    public String name;
    public double rating;
    public String[] authors;

    public Author(){}

    public Author(long authorId) {
        this.id = authorId;
    }


/*    public Author(String[] authors) {
        this.authors = authors;
    }*/

    // Перегруженный конструктор
    public Author(long authorId, String name) {
        this(authorId);
        this.name = name;
    }

    public Author(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Автор: id = " + id + ", name = " + name);
    }

    public String getInfo() {
        return "Автор: id = " + id + ", name = " + name;
    }

    public void getInfo(String prefix) {
        if (prefix == null) return;
        System.out.println(prefix + "Автор: id = " + id + ", name = " + name);

    }
}
