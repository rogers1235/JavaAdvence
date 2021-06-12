package com.sda.designpatterns.solid.isp;

public class Motorcycle implements MovingVehicle{

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Motorcycle is decelerating");
    }

}
