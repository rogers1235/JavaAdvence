package com.sda.designpatterns.behaviorals.strategy;

public class Airplane extends Vehicle{
    public Airplane(String brand) {
        super(brand);
        setFlyType(new FlyHigh());

    }


}
