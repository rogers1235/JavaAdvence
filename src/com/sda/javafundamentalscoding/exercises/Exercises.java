package com.sda.javafundamentalscoding.exercises;



    import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

    public class Exercises {

        //    Task 16 din pdf
        public int getLengthOfLongestSubsequence(int[] numbers) {
            int length = 1;
            int temporaryLength = 1;
            int previousElement = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > previousElement) {
                    temporaryLength++;
                } else {
                    if (temporaryLength > length) {
                        length = temporaryLength;
                    }
                    temporaryLength = 1;
                }
                previousElement = numbers[i];
            }
            return length;
        }

        //    Task 17 din pdf
        public void calculateDaysUntilNextCourse(){
            System.out.println("Introdu data urmatorului curs SDA in formatul dd.MM.yyyy HH:mm");
            String dateAsString = ScannerUtils.getScanner().nextLine();
            long days = 0;
            try {
                LocalDateTime nextCourseDate = LocalDateTime.parse(dateAsString, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
                days = LocalDateTime.now().until(nextCourseDate, ChronoUnit.HOURS);
            }catch (Exception exception){
                System.out.println("Data introdusa nu este valida");
            }
            System.out.println("Number of days till your next course SDA is: " + days);
        }

        public void printDateTime(){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMM.yyyy hh:mma");
            System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
        }


    }







