package com.trimindtech.training.day08;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import static java.lang.System.exit;

public class BookRental {
    public int enterOption;
    private static Catalog catalog = new Catalog();
    private static Borrower borrower = new Borrower();
    private static Scanner sc = new Scanner(System.in);
    private static Connection con = DBconnect.getCon();


    public static void printOptions() {
        System.out.println("*******Welcome to Book Rental System*******");
        System.out.println("*******************************************");
        System.out.println("Enter 1: Search for a book");
        System.out.println("Enter 2: Add book to catalog");
        System.out.println("Enter 3: Delete book from catalog");
        System.out.println("Enter 4: List of books in the catalog");
        System.out.println("Enter 5: Rent a book");
        System.out.println("Enter 6: Return a book");
        System.out.println("Enter 7: Print out borrower list");
        System.out.println("Enter 8: Exit the program");
    }

    public static void main(String[] args) {

        System.out.println("data from collection");
        System.out.println(catalog.getBooks().toString());
        try {
            PreparedStatement ps = con.prepareStatement("select * from book");
            ResultSet rs = ps.executeQuery();
            System.out.println("data from db");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "+ rs.getString(4));
            }
        }catch(Exception e){
                System.out.println(e.getMessage());
            }

        System.out.println(borrower.getClass().toString());

            printOptions();
            int ch = sc.nextInt();
            do{
                switch(ch){
                    case 1:
                        addBooks();
                        break;
                    case 2:
                        printBookDetails();
                        break;
                    case 3:
                        deleteBook();
                        break;
                    case 4:
                        searchBook();
                        break;
                    case 5:
                        catalog.rentBook();
                        break;
                    case 6:
                        catalog.returnBook();
                        break;
                    case 7:
                        printBorrowerList();
                        break;
                    case 8:
                        exit(0);
                        break;
                    case 9:
                        catalog.saveBook();
                        break;
                    case 10:
                        loadData();
                        break;
                        default:
                            System.out.println("enter valid option");
                            System.out.println("");
                }
                printOptions();
                ch = sc.nextInt();
            }while(ch!=8);

        {

            Book book = new Book();
            System.out.println("enter author name");
            String name = sc.next();
            book.setName(name);
            System.out.println("enter book title");
            String title = sc.next();
            book.setTitle(title);
            System.out.println("enter academic or not");
            boolean isAcademic = sc.nextBoolean();
            book.setAcademic(true);
            System.out.println("enter isbn");
            int isbn = sc.nextInt();
            book.setISBN(isbn);
            System.out.println("enter the stock");
            int stock = sc.nextInt();
            book.setTotalCount(stock);
            sc.nextLine();

            try {
                String query = "insert into book values (?,?,?,?,?)";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, title);
                preparedStatement.setBoolean(3,isAcademic);
                preparedStatement.setInt(4, isbn);
                preparedStatement.setInt(5, stock);
                int n = preparedStatement.executeUpdate();
                if (n == 1) {
                    System.out.println("record inserted succesfully");
                } else {
                    System.out.println("record not inserted succesfully");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            catalog.addBook(book);
            System.out.println("the book has been added");
            System.out.println(book.toString());

        }
        /*{
            System.out.println("search for a book");
            String bookName = sc.next();
            Book book = Catalog.searchBook(bookName);
        }

        System.out.println("enter book title");
        String bookName = sc.next();
        try {
            PreparedStatement preparedStatement = con.prepareStatement("delete from bookdetails where booktitle = 2 ");
            preparedStatement.setString(1, bookName);
            preparedStatement.executeUpdate();
            System.out.println("data deleted from db");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Book book = new Book();
        book = book.searchBook();
        if (book == null) {
            System.out.println("the book is not in the store");
        } else {
            catalog.deleteBook(book);
            System.out.println("the book is deleted");
        }

        BorrowerFile borrowerFile = new BorrowerFile();
        Scanner sc = new Scanner(System.in);
*/
    }

    private static void  loadData() {
    }
    private static void addBooks(){
    }
    private static void printBookDetails(){
    }
    private static void deleteBook(){
    }
    private static void searchBook(){
    }
    private static void printBorrowerList(){
    }
}