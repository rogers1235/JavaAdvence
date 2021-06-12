package com.sda.designpatterns.solid.ocp;

public class EgyptianCat extends Cat {

    public EgyptianCat(String name) {
        super(name);
    }

    @Override
    protected void brushCat() {
        System.out.println("the cat " + name + " cannot be brushed");
    }
}
