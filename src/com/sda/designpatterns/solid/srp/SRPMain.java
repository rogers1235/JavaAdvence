package com.sda.designpatterns.solid.srp;

import java.time.LocalDate;

public class SRPMain {

    public static void main(String[] args) {
        Car audi = new Car("Audi", LocalDate.of(2021, 4, 10));

        ServiceITP service = new ServiceITP();

        service.doInspection(audi);

        System.out.println(audi.getLastInspection());
    }

}
