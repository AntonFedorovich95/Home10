package ru.skypro;

import java.util.Objects;

public class Book {
    private final String bookname;
    private final Author author;
    private int year;

    public Book (String name, Author author, int year) {
        this.bookname = name;
        this.author = author;
        this.year = year;
    }
    public String getBookname() {
        return bookname;
    }
    public Author getAuthor() {
        return author;
    }
    public int setYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(bookname, book.bookname) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookname, author, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}
