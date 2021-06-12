package com.sda.cristi.javafundamentals.javafundamentals.numberguessinggame;

import java.util.Random;


class NumberGuessingGame{

    private int maxNumberOfTries;
    private int limit;

    public NumberGuessingGame(int tries, int limit) {
        this.maxNumberOfTries = tries;
        this.limit = limit;
    }

    public void play(){
        System.out.printf("Salut, Ghiceste numarul intre 1 si %s. Ai %s incercari\n", limit, maxNumberOfTries);

        int numberToBeGuessed = getRandomNumberTillLimit(limit);

        int countOfTries = 0;

        do{
            int userInput = ScannerUtils.getNumberFromConsole();

            if (userInput == numberToBeGuessed){
                System.out.println("Felcitari. Ai castigat!");
                break;
            } else if(userInput < numberToBeGuessed){
                System.out.println("Numarul ales este mai mic decat cel corect");
            }else {
                System.out.println("Numarul ales este mai mare decat cel corect");
            }
            countOfTries++;
        }while (countOfTries < maxNumberOfTries);


    }


    private int getRandomNumberTillLimit(int limit){
        Random random = new Random();
        return random.nextInt(limit) + 1;
    }



}
