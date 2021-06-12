package com.sda.cristi.javafundamentals.javafundamentals.homework.exercitiicontrolflow;

public class Exercitiu3 {
    public static void main(String[] args) {
        boolean canSeePlayer = true;
        if (canSeePlayer) {
            boolean playerPoweredUp = false;
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }
    }
}