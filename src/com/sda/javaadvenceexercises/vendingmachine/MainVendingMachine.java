package com.sda.javaadvenceexercises.vendingmachine;

import java.util.ArrayList;

public class MainVendingMachine {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(new ArrayList<>());
        vendingMachine.getProductsList();

    }
}