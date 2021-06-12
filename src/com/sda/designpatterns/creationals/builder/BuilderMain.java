package com.sda.designpatterns.creationals.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Electric")
                .setElectricWindows(true)
                .setAutoPilot(true)
                .setHeatChairs(true)
                .setAcType("Climatronic")
                .build();

        System.out.println(car);

    }

}
