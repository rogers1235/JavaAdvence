package com.sda.designpatterns.solid.dip;

public class DIPMain {

    public static void main(String[] args) {
        Courier dhl = new Courier();

        dhl.deliverPackage("Gift", new Bicycle());

        Van caddy = new Van();

        dhl.deliverPackage("Fridge", caddy);
    }

}
