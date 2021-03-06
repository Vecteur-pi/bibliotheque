package com.udemy.bibiotheque.borrow;

import com.udemy.bibiotheque.book.Book;
import com.udemy.bibiotheque.user.User;

import java.time.LocalDate;

public class Borrow {

    private User borrower;
    private User lender;
    private Book book;
    private LocalDate askDate;
    private LocalDate closeDate;

    public LocalDate getAskDate() {
        return askDate;
    }

    public void setAskDate(LocalDate askDate) {
        this.askDate = askDate;
    }

    public LocalDate getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(LocalDate closeDate) {
        this.closeDate = closeDate;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public User getLender() {
        return lender;
    }

    public void setLender(User lender) {
        this.lender = lender;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
