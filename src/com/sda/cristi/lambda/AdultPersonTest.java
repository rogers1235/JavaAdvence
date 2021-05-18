package com.sda.cristi.lambda;


    public class AdultPersonTest implements InterfaceForLambda<Person> {
        @Override
        public boolean printMessage(String message) {
            System.out.println(message);

            return true;
        }
}
