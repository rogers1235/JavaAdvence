package com.sda.cristi.javafundamentals.javafundamentals.controlflow;

public class ControlFlow {




        public static void main(String[] args) {

            String dayOfWeek = "Sunday";

            switch (dayOfWeek) {
                case "Luni":
                    System.out.println("the grass doesn't grow");
                    break;
                case "Marti":
                case "Miercuri":
                case "Joi":
                case "Vineri":
                    System.out.println("Middle of the week");
                    break;
                case "Saturday":
                case "Sunday":
                    System.out.println("Course JAVA");
                    break;
                default:
                    System.out.println("None of the cases above were found");
                    break;
            }

            if (true) {
                int number = 0;
                System.out.println(number);
                System.out.println(dayOfWeek);
                number = number + 1;
                boolean valid = true;
                if(valid){
                    int otherNumber = 1;
                    System.out.println(otherNumber);
                }
            }

        }

    }
