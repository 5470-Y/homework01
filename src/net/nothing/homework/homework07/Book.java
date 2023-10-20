package net.nothing.homework.homework07;

import java.util.Arrays;

public class Book {

    private String name;
    private boolean isPublished;
    private int numberOfAuthors;
    private Author[] authors;

    public Book(String name, int numberOfAuthors) {
        this.setName(name);// this.name = name;
        this.setNumberOfAuthors(numberOfAuthors);
        this.authors = new Author[numberOfAuthors];
    }


    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name could not be null");
        }
        this.name = name;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        if (numberOfAuthors < 1 || numberOfAuthors >= 5) {
            throw new IllegalArgumentException("Book has from 1 to 4 authors");
        }
        if (numberOfAuthors >= 1 && numberOfAuthors < 5) {
            this.numberOfAuthors = numberOfAuthors;
        }
    }

    public String getName() { // Getter
        return name;
    }

    public int getNumberOfAuthors() {
        if (numberOfAuthors < 1 || numberOfAuthors >= 5) {
            throw new IllegalArgumentException("Book has from 1 to 4 authors");
        }
        if (numberOfAuthors >= 1 && numberOfAuthors < 5) {
            this.numberOfAuthors = numberOfAuthors;
        }
        return numberOfAuthors;
    }

    public String getAuthors() {
        return Arrays.deepToString(authors);
    }

    public void addAddAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("author is mandatory argument");
        }
        for (int i = 0; i < authors.length; i++) {
            if (author == authors[i]) i++;
            authors[i] = new Author();

        }

    }
}


