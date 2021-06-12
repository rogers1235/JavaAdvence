package com.sda.designpatterns.behaviorals.observer;

public class Student extends Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void notifyPublishedArticle(String article) {
        System.out.println("The student " + name + " is reading the article: " + article);
    }
}