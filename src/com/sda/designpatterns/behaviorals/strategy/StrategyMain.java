package com.sda.designpatterns.behaviorals.strategy;

public class StrategyMain {
    public static void main(String[] args) {

        Car audi = new Car("Audi");


        Airplane airplane = new Airplane("Boeing");

        audi.tryToFly();
        System.out.println("--------------");
        airplane.tryToFly();
        System.out.println("--------------");
        audi.setFlyType(new FlyHigh());
        audi.tryToFly();


    }
}
