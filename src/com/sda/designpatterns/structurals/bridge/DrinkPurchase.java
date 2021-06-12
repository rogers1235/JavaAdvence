package com.sda.designpatterns.structurals.bridge;

public abstract class DrinkPurchase {

    private Drink drink;
    private String paymentMethod;

    public DrinkPurchase(Drink drink, String paymentMethod) {
        this.drink = drink;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(){
        System.out.println("Pay the sum of " + drink.getPrice() + " with " + paymentMethod + " for drink: " +drink);
    }

}
