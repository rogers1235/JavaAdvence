package com.sda.javafundamentalscoding.vendingmachine;

public class MainStartingProgram {

    public static void main(String[] args) {
       VendingMachine vendingMachine = new VendingMachine  ();
        vendingMachine.simulateShopping();

VendingMachine coffeeTeaDispenser = new VendingMachine(getCoffeeTeaProducts());
        coffeeTeaDispenser.simulateShopping();
    }

    private static Product[] getCoffeeTeaProducts(){
        Product coffee = new Product(2, "Capucino", 1);
        Product tea = new Product(3, "Black tea", 2);
        Product hotChocolate = new Product(7, "Hot Chocolate", 3);

        // fist variant for creating and initialize an array of objects
        Product[] arrayOfProducts = new Product[3];
        arrayOfProducts[0] = coffee;
        arrayOfProducts[1] = tea;
        arrayOfProducts[2] = hotChocolate;

        // second variant for creating and initialize an array of objects
        Product[] secondArrayOfProducts = {coffee, tea, hotChocolate};

        // third variant for creating and initialize an array of objects
        Product[] thirdArrayOfProducts = new Product[] {coffee, tea, hotChocolate};

        return new Product[] {coffee, tea, hotChocolate};
    }

}


