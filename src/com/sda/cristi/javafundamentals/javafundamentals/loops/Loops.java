package com.sda.cristi.javafundamentals.javafundamentals.loops;

import java.util.Scanner;

public class Loops {



        public static void main(String[] args) {

            sumNumbersFromInputWithWhile();
//        sumNumbersFromInput();
//        exampleDoWhile();
//
//        exampleWhile();

//        printAllNumbersTillTheGivenNumber(10);
//
//        printAllNumbersTillTheGivenNumberWithDoWhile(10);
//
//        System.out.println("S-a terminat programul");

        }

        public static void sumNumbersFromInput() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Scrieti numerele pe care vreti sa fie adunate. Cand vreti sa va opriti scrieti stop");

            int input;
            int sum = 0;

            do {
                input = scanner.nextInt();
                sum = sum + input;

            } while (input != 0);

            System.out.println("Suma numereleor introduse este: " + sum);

        }

        public static void sumNumbersFromInputWithWhile() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Scrieti numerele pe care vreti sa fie adunate. Cand vreti sa va opriti scrieti stop");

            int input = 0;
            int sum = 0;

            while (input != 0){
                input = scanner.nextInt();
                sum = sum + input;
            }

            System.out.println("Suma numereleor introduse este: " + sum);

        }


        public static void exampleDoWhile() {
            boolean esteGata = false;
            int counter = 0;
            do {
                System.out.println("Suntem in cadrul unui loop do while");
                counter++;
                if (counter >= 3) {
                    esteGata = true;
                }
            } while (!esteGata);
        }

        public static void exampleWhile() {
            boolean esteGata = false;
            int counter = 0;
            while (!esteGata) {
                System.out.println("Suntem in cadrul unui loop while");
                counter++;
                if (counter >= 3) {
                    esteGata = true;
                }
            }
        }

        public static void printAllNumbersTillTheGivenNumber(int limit) {
            int counter = 1;

            while (counter <= limit) {
                System.out.println(counter);
                counter++;
            }

        }

        public static void printAllNumbersTillTheGivenNumberWithDoWhile(int limit){
            int counter = 1;

            do{
                System.out.println(counter);
                counter++;
            } while (counter <= limit);
        }

        public static void printAllNumbersTillTheGivenNumber(double limit) {
            double counter = 1.0;

            while (counter <= limit) {
                System.out.println(String.format("%.1f", counter));
                counter = counter + 0.1;
            }
        }


    }


