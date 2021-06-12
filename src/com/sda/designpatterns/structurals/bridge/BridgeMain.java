package com.sda.designpatterns.structurals.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Drink coffee = new Coffee("Latte", 10);
        Drink tea = new Tea("Ice tea", 5);

        DrinkPurchase card = new CardPurchase(coffee, "Card");
        DrinkPurchase cash = new CashPurchase(tea, "Cash");

        card.makePayment();

        cash.makePayment();

    }

}
