package com.sda.designpatterns.solid.ocp;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    protected void brushCat() {
        System.out.println("the cat " + name + " is being brushed");
    }

}
