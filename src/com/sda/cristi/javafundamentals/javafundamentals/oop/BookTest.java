package com.sda.cristi.javafundamentals.javafundamentals.oop;

public class BookTest {

    public static void main(String[] args) {
        Book lordOfTheRings = new Book();

        lordOfTheRings.printBookAttributes();

        if(lordOfTheRings.title != null) {
            System.out.println(lordOfTheRings.title.length());
        }

        lordOfTheRings.title = "Lord of the rings";
        lordOfTheRings.authorName = "J.R.R Tolkien";
        lordOfTheRings.numberOfPages = 500;

        lordOfTheRings.printBookAttributes();

        Book gameOfThrones = new Book("Game of thrones", "Name of author", 1000);

        gameOfThrones.printBookAttributes();

        com.sda.cristi.javafundamentals.javafundamentals.oop.rightway.Book book = new com.sda.cristi.javafundamentals.javafundamentals.oop.rightway .Book("Colt alb", 250);

        System.out.println(book.getTitle());
        book.setTitle("Harry Potter");
        System.out.println(book.getTitle());

    }


}








