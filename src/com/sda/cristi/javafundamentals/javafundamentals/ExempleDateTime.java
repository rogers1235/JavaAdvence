package com.sda.cristi.javafundamentals.javafundamentals;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExempleDateTime {



        public static void main(String[] args) {

            LocalDateTime now = LocalDateTime.now();

            System.out.println(now);

            System.out.println(now.plusHours(1));

            String dateFormat = "MM dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
            System.out.println(simpleDateFormat.format(new Date()));

            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println(myFormatObj.format(now.minusHours(3)));
            System.out.println(timeFormatter.format(now));
        }

}
