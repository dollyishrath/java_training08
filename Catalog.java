package com.trimindtech.training.day08;

import java.util.ArrayList;

public class Catalog extends Book{
    public Catalog() {
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book getBook1() {
        return book1;
    }

    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    public Book getBook2() {
        return book2;
    }

    public void setBook2(Book book2) {
        this.book2 = book2;
    }

    public Book getBook3() {
        return book3;
    }

    public void setBook3(Book book3) {
        this.book3 = book3;
    }

    public Catalog(String name, String title, int ISBN, boolean isAcademic, int totalCount){
        super(name, title, ISBN, isAcademic, totalCount);
    }
    ArrayList<Book> books = new ArrayList<Book>();
    Book book1 = new Book("mahek","tanna",1234,true, 10);
    Book book2 = new Book("sana","muskan",2345,false,20);
    Book book3 = new Book("sonu","monu",3456,true,30);

    @Override
    public String toString() {
        return "Catalog{" +
                "books=" + books +
                ", book1=" + book1 +
                ", book2=" + book2 +
                ", book3=" + book3 +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", ISBN=" + ISBN +
                ", isAcademic=" + isAcademic +
                ", totalCount=" + totalCount +
                '}';
    }

    public static Book searchBook(String bookName) {
        return null;
    }
}