package com.sda.cristi.javafundamentaladvence.cristi.exercises.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //fara lambda expression
        Math addtion = new Math() {
            @Override
            public double calculate(int a, int b) {
                return a + b;
            }
        };
        System.out.println(addtion.calculate(2, 3));

        // cu lambda expression
        Math additionLambda = (int a, int b) -> a + b;
        System.out.println("Whit Lambda: " + additionLambda.calculate(2, 3));

        Math substractionLambda = (a, b) -> a - b;
        System.out.println(substractionLambda.calculate(2, 3));

        Math divisionLambda = (a, b) -> a / b;
        System.out.println("division:" + divisionLambda.calculate(6, 3));

        Math multiplicationLambda = (a, b) -> a * b;
        System.out.println("multiplication: " + multiplicationLambda.calculate(2, 4));

        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(53);
        numbers.add(100);
        numbers.add(20);
        numbers.add(10);


        int sum = 0;

        for (Integer number : numbers) {

            //fara lambda expression
            //  sum = sum + number;

            // cu lambda expression
            Math sumElement = (int sumLambda, int numberLambda) -> sumLambda + numberLambda;

//(int) face cast din double in int ( double ptr ca methoda calculete returneaza double)
            sum = (int) sumElement.calculate(sum, number);
        }

        System.out.println("Sum whit lambda: " + sum);
    }

}
