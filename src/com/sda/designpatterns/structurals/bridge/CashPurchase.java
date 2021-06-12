package com.sda.designpatterns.structurals.bridge;

public class CashPurchase extends DrinkPurchase {

    public CashPurchase(Drink drink, String paymentMethod) {
        super(drink, paymentMethod);
    }

}
