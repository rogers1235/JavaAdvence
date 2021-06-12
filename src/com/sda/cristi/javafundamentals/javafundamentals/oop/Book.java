package com.sda.cristi.javafundamentals.javafundamentals.oop;

public class Book {


    String title;
    String authorName;
    int numberOfPages;

    public Book(){
    }

    public Book(String title, String authorName, int numberOfPages) {
        this.title = title;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
    }

    public void printBookAttributes(){
        System.out.println("This book has the following attributes: title = "
                + title + ", author = " + authorName
                + ", pages = " + numberOfPages);
    }
}
