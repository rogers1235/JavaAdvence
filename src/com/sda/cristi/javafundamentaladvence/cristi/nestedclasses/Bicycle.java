package com.sda.cristi.javafundamentaladvence.cristi.nestedclasses;

public class Bicycle {


        private int maxSpeed = 20;

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public class Wheel {
            public void damage() {
                maxSpeed *= 0.5;
            }
        }
}
