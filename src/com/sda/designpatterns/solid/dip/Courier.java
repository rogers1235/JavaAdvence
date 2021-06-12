package com.sda.designpatterns.solid.dip;

public class Courier {

    public void deliverPackage(String packageName, Vehicle vehicle){
        System.out.println("Take package");
        vehicle.ride();
        System.out.println("Deliver package " + packageName);
    }


}
