package com.trimindtech.training.day08;

public class Borrower {
    public String firstName;
    public String lastName;
    public String book;
    public String date;

    public Borrower(String firstName, String lastName, String book, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.book = book;
        this.date = date;
    }

    public Borrower() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
