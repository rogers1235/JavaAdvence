package com.sda.designpatterns.structurals.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        Image image = new ProxyImage("poza.jpg");

        image.display();

        image.display();
    }
}
