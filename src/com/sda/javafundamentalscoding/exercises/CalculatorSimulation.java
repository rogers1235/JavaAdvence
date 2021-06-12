package com.sda.javafundamentalscoding.exercises;

public class CalculatorSimulation {

        public void simulateMathOperation() {
            System.out.println("Introdu primul numar al operatirei");
            float firstNumberFromUser = ScannerUtils.getFloatNumberFromConsole();
            System.out.println("Introdu symbolul operatiei matematice dintre * / + -");
            ScannerUtils.getScanner().nextLine();
            String operationSymbolFromUser = ScannerUtils.getScanner().nextLine();
            System.out.println("Introdu al doilea numar pentru operatia matematica");
            float secondNumberFromUser = ScannerUtils.getFloatNumberFromConsole();

            if (!isSymbolValid(operationSymbolFromUser)) {
                System.out.println("Invalid symbol");
                return;
            }

            if (isMathOperationInvalid(operationSymbolFromUser, secondNumberFromUser)) {
                System.out.println("Cannot calculate");
                return;
            }
            System.out.println("Rezultatul operatiei alese este: " + doMathOperation(firstNumberFromUser, operationSymbolFromUser, secondNumberFromUser));

        }

        private boolean isSymbolValid(String symbol) {
            return "+-*/".contains(symbol) && symbol.length() == 1;
        }

        private boolean isMathOperationInvalid(String symbol, float secondNumber) {
            return symbol.equals("/") && secondNumber == 0;
        }

        private float doMathOperation(float firstNumber, String operationSymbol, float secondNumber) {
            switch (operationSymbol) {
                case "+":
                    return firstNumber + secondNumber;
                case "-":
                    return firstNumber - secondNumber;
                case "*":
                    return firstNumber * secondNumber;
                case "/":
                    return firstNumber / secondNumber;
                default:
                    System.out.println("Invalid symbol");
                    return 0;
            }
        }


    }



