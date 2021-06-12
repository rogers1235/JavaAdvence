package com.sda.designpatterns.creationals.singleton;

//Lazy
public class Counter {

    private int count;
    private static Counter instance;

    private Counter() {
    }

    public static Counter getInstance(){
        if (instance == null){
            instance = new Counter();
        }
        return instance;
    }

    public void incrementCount(){
        count++;
    }

    public int getCount() {
        return count;
    }

}
