package com.sda.cristi.javafundamentals.javafundamentals.dice;

import java.util.Random;

public class DiceGame {


        public static void main(String[] args){
            String cuvant = "ceva";
            new StringBuilder(cuvant).reverse();


            System.out.println("The numbers of tries is: " + numberOfTriesWithDoWhile());
        }

        public static int numberOfTriesWithDoWhile(){
            int triesCount = 0;
            int dice1;
            int dice2;

            do{
                dice1 = rollDice(8);
                dice2 = rollDice(8);
                System.out.println("Dice1 is:" + dice1 + " and dice2 is: " + dice2);
                triesCount++;
            }while (dice1 != dice2);

            return triesCount;
        }

        public static int numberOfTriesForRollingTwoDices(){
            int triesCount = 1;
            int dice1 = rollDice(6);
            int dice2 = rollDiceWithRandomClass();

            while (dice1 != dice2){
                triesCount++;
                dice1 = rollDice(6);
                dice2 = rollDiceWithRandomClass();
            }

            return triesCount;
        }

        public static int rollDiceWithRandomClass(){
            int number = new Random().nextInt(6) + 1;
            return number;
        }

        public static int rollDice(int sides){
            double number = Math.random() * sides;
            int side = (int) number + 1;
            return side;
        }

    }
