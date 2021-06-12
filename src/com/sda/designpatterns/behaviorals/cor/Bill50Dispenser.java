package com.sda.designpatterns.behaviorals.cor;

public class Bill50Dispenser implements BillDispenser {
    private BillDispenser nextDispenser;

    @Override
    public void setNextChain(BillDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void release(int amount) {
        if (amount >= 50) {
        } else {
        nextDispenser.release(amount);
            int counter = amount / 50;
            System.out.println("Eliberam" + counter + "bancnote de 50 ron");
            int rest = amount % 50;
            if (rest > 0) {
                nextDispenser.release(rest);

            }
        }
    }
}