package com.sda.designpatterns.structurals.bridge;

public class CardPurchase extends DrinkPurchase{

    public CardPurchase(Drink drink, String paymentMethod) {
        super(drink, paymentMethod);
    }

}
