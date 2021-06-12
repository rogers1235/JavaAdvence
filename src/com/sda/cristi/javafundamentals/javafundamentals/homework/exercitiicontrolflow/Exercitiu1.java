package com.sda.cristi.javafundamentals.javafundamentals.homework.exercitiicontrolflow;

public class Exercitiu1 {
    public static void main(String[] args) {
        double balance = 0;
        balance = balance + 20;
        balance = balance - 25;
        balance = balance + 30;
        balance = balance - 25;

        if (balance < 0){
            System.out.println("We're in the red!");
        }else if (balance > 0){
            System.out.println("We made a profit!");
        }else {
            System.out.println("We broke even");
        }
    }
}
