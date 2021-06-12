package com.sda.designpatterns.creationals.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();

        counter1.incrementCount();

        Counter counter2 = Counter.getInstance();

        counter2.incrementCount();

        System.out.println("From counter1: " + counter1.getCount());
        System.out.println("From counter2: " + counter2.getCount());

        System.out.println(counter1);
        System.out.println(counter2);

    }
}
