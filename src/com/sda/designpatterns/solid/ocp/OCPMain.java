package com.sda.designpatterns.solid.ocp;

public class OCPMain {

    public static void main(String[] args) {
        Cat tommy = new Cat("Tommy");

        EgyptianCat sfinx = new EgyptianCat("Sfinx");

        tommy.brushCat();

        sfinx.brushCat();

    }

}
