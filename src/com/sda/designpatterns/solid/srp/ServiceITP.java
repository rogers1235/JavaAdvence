package com.sda.designpatterns.solid.srp;

import java.time.LocalDate;

public class ServiceITP {

    public void doInspection(Car car){
        if (car.isInspectionExpired()){
            System.out.println("WARNING: The cars was used after inspection expired");
        }

        System.out.println("Check breaks, check engine, etc for car: " + car);

        car.setLastInspection(LocalDate.now());
    }

}
