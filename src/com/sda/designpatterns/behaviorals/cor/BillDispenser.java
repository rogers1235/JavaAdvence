package com.sda.designpatterns.behaviorals.cor;

public interface BillDispenser {

    void setNextChain(BillDispenser nextDispenser);

    void release(int amount);
}
