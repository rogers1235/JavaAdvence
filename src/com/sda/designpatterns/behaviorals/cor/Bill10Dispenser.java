package com.sda.designpatterns.behaviorals.cor;

public class Bill10Dispenser implements BillDispenser {

    private BillDispenser nextDispenser;

    @Override
    public void setNextChain(BillDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void release(int amount) {
        if (amount >= 10) {
         } else {
        nextDispenser.release(amount);
            int counter = amount / 10;
            System.out.println("Eliberam" + counter + "bancnote de 10 ron");
            int rest = amount % 10;
            if (rest > 0) {
                nextDispenser.release(rest);

            }
        }
    }
}