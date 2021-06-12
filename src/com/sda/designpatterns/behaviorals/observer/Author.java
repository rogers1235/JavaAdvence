package com.sda.designpatterns.behaviorals.observer;

import java.util.ArrayList;
import java.util.List;

public class Author implements Observable {

    private String article;
    private List<Observer> observerList;

    public Author() {
        observerList = new ArrayList<>();
    }

    public void publishArticle(String article) {
        this.article = article;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.notifyPublishedArticle(article);

        }
    }
}
