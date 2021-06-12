package com.sda.designpatterns.solid.lsp;

public class LSPMain {

    public static void main(String[] args) {
        Vehicle truck = new Vehicle("Mercedes");

        Car audi = new Car("Audi");

        VehicleService service = new VehicleService();

        service.repairVehicle(truck);

        service.repairVehicle(audi);
    }

}
