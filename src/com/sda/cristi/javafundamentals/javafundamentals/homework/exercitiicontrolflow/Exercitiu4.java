package com.sda.cristi.javafundamentals.javafundamentals.homework.exercitiicontrolflow;

public class Exercitiu4 {
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isRaining || isSnowing || temperature < 50) {
            System.out.println("Let’s stay home.");
        } else {
            System.out.println("Let’s go out!");
        }
    }
}