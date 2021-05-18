package com.sda.cristi.exceptions.exercitii;


public class CarCrashedException extends Exception {
    public CarCrashedException(Car car) {
        // calling Exception(String message) constructor
        super("Car " + car + " has crashed!");
//        System.out.println("Speed: " + car.getSpeed());
    }

}


