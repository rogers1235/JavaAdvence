package com.sda.designpatterns.solid.isp;

public class Airplane implements MovingVehicle, FlyingVehicle{
    @Override
    public void accelerate() {
        System.out.println("Airplane is accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Airplane is decelerating");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

}
