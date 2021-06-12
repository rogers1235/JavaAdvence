package com.sda.designpatterns.solid.srp;

import java.time.LocalDate;
import java.time.Period;

public class Car {

    private String brand;
    private LocalDate lastInspection;

    public Car(String brand, LocalDate lastInspection) {
        this.brand = brand;
        this.lastInspection = lastInspection;
    }

    public LocalDate getLastInspection() {
        return lastInspection;
    }

    public void setLastInspection(LocalDate lastInspection) {
        this.lastInspection = lastInspection;
    }

    public boolean isInspectionExpired(){
        LocalDate currentDate = LocalDate.now();

        Period timeBetweenNowAndLastInspection = Period.between(lastInspection, currentDate);

        return timeBetweenNowAndLastInspection.getYears() >= 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", lastInspection=" + lastInspection +
                '}';
    }
}
