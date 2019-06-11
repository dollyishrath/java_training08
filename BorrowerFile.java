package com.trimindtech.training.day08;

public class BorrowerFile {
    public String firstName;
    public String lastName;
    public String email;
    public int ISBN;
    public int numberOfDaysLoan;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumberOfDaysLoan() {
        return numberOfDaysLoan;
    }

    public void setNumberOfDaysLoan(int numberOfDaysLoan) {
        this.numberOfDaysLoan = numberOfDaysLoan;
    }
}
