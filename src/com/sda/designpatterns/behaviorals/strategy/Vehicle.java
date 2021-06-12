package com.sda.designpatterns.behaviorals.strategy;

public abstract  class Vehicle {

    private String brand;
    private Fly flyType;

    public void setFlyType(Fly flyType) {
        this.flyType = flyType;
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }
    public  void tryToFly(){
        if (flyType != null){
            flyType.fly();
        }

        }

    }





