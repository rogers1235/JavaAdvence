package com.sda.designpatterns.behaviorals.cor;



public class ATM {

    private BillDispenser dispenser;

    public ATM() {
        Bill100Dispenser dispenserFor100 = new Bill100Dispenser();
        Bill50Dispenser dispenserFor50 = new Bill50Dispenser();
        Bill10Dispenser dispenserFor10  = new Bill10Dispenser();

        dispenserFor50.setNextChain(dispenserFor10);
        dispenserFor100.setNextChain(dispenserFor50);

        dispenser = dispenserFor100;
    }

    public  void  releaseMoney( int amount){
        if (amount % 10 == 0){
            dispenser.release(amount);

        }else{
            System.out.println( "Poti sa scoti doar sume multiple de 10");
        }
    }

}
