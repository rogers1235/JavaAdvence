package com.sda.designpatterns.behaviorals.strategy;

public class FlyHigh implements Fly{
    @Override
    public void fly() {
        System.out.println("I'm flying high");
    }
}
