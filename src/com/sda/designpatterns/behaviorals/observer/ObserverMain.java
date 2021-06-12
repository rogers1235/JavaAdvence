package com.sda.designpatterns.behaviorals.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Author eminescu = new Author();

        Student mihai = new Student("Mihai");
        Student elena = new Student("Elena");

        eminescu.subscribe(mihai);
        eminescu.subscribe(elena);

        eminescu.publishArticle("The best article ever");

        eminescu.unsubscribe(mihai);

        eminescu.publishArticle("The last article");


    }
}