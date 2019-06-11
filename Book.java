package com.trimindtech.training.day08;

public class Book {

    public Book(){

    }
    public String name;
    public String title;
    public int ISBN;
    public boolean isAcademic;
    public int totalCount;

    public Book searchBook(){

        return null;
    }

    public void addBook(Book book){

    }

    public void deleteBook(Book book){

    }
    public void rentBook(){

    }
    public void returnBook(){

    }
    public void saveBook(){

    }

    public Book(String name, String title, int ISBN, boolean isAcademic, int totalCount) {
        this.name = name;
        this.title = title;
        this.ISBN = ISBN;
        this.isAcademic = isAcademic;
        this.totalCount = totalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAcademic() {
        return isAcademic;
    }

    public void setAcademic(boolean academic) {
        isAcademic = academic;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", ISBN=" + ISBN +
                ", isAcademic=" + isAcademic +
                ", totalCount=" + totalCount +
                '}';
    }
}
