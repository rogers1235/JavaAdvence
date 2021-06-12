package com.sda.javaadvenceexercises.vendingmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private List<String> productsList;


    public VendingMachine(List<String> productsList) {
        this.productsList = productsList;

    }

    public List<String> getProductsList() {

        return productsList;
    }

    public void setProductsList(List<String> productsList) {
        this.productsList = productsList;
    }

    public List<String> createProductList() {
        productsList = new ArrayList<>();
        productsList.add("Lapte");

        return productsList;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Please select the product that you want: " + getProductsList());
    }
}
