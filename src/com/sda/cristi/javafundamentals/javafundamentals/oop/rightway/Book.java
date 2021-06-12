package com.sda.cristi.javafundamentals.javafundamentals.oop.rightway;

public class Book {
    private String title;
    private int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle(){
        return title;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setTitle(String title){
        this.title = title;
    }
    }
