package com.sda.designpatterns.behaviorals.observer;

public interface Observable {

       void subscribe(Observer observer);
       void unsubscribe(Observer observer);


       void notifyObserver();

    void notifyObservers();
}
