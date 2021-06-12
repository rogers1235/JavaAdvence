package com.sda.designpatterns.behaviorals.cor;

public class Bill100Dispenser implements BillDispenser{

    private BillDispenser nextDispenser;

    @Override
    public void setNextChain(BillDispenser nextDispenser) {
    this.nextDispenser = nextDispenser;
    }

    @Override
    public void release(int amount) {

       if (amount >= 100){
          int  counter = amount / 100;
           System.out.println("Eliberam" + counter + "bancnote de 100 ron");
           int rest = amount % 100;
           if(rest > 0){
               nextDispenser.release(rest);
           }else{
               nextDispenser.release(amount);
           }

       }
    }
}
