package com.sda.cristi.javafundamentals.javafundamentals.homework.exercitiiloops;

public class Exercitiu3 {
    public int yearsTilOneMillion(double initialBalance) {
        int years = 0;

    double balance = initialBalance;
    while (balance < 1000000) {
        years++;balance = balance*1.05;
    }
    return years;
}
}