package com.sda.javafundamentalscoding.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Numbers {
        public void testSumForDoubles(){
            double firstNumber = 2.8999;
            double secondNumber = 0.1;
            System.out.println(firstNumber + secondNumber);
        }

        public void roundNumberWithDecimalFormat(double number){
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(df.format(number));
        }

        public void roundNumberWithBigDecimal(double number, int decimals){
            BigDecimal bd = new BigDecimal(Double.toString(number));
            bd = bd.setScale(decimals, RoundingMode.HALF_EVEN);
            System.out.println(bd.doubleValue());
        }

        public void roundNumberWithMath(double number, int decimals){
            double scale = Math.pow(10, decimals);
            System.out.println(Math.round(number * scale) / scale);
        }



    }


