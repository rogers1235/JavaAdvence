package com.sda.javafundamentalscoding.exercises;

public class ComplexMathEquations {






        public void calculateQuadraticEquation(int a, int b, int c) {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Delta negativ");
                return;
            }
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("Factorul x1 este: %.2f si factorul x2 este: %.2f\n", x1, x2);
        }


        public void sumOfHarmonicSeries() {
            System.out.println("Introdu numarul dorit pentru calcularea seriei armonice");
            int number = ScannerUtils.getNumberFromConsole();
            double sum = 0;
            for (int i = 1; i <= number; i++) {
                sum = sum + (1 / (double) i);
            }
            System.out.printf("Suma seriei armonice pentru numarul %d este: %.2f\n", number, sum);
        }

        public int fibonacciNumber() {
            System.out.println("Introdu pozitia numarului pe care vrei sa il afli din seria lui Fibonacci");
            int position = ScannerUtils.getNumberFromConsole();
            int beforePreviousNumber = 0;
            int previousNumber = 1;
            int currentNumber = 1;
            for (int i = 1; i <= position; i++){
                currentNumber = previousNumber + beforePreviousNumber;
                beforePreviousNumber = previousNumber;
                previousNumber = currentNumber;
            }
            return currentNumber;
        }


    }



