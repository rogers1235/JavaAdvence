package com.sda.cristi.javafundamentaladvence.cristi.shapes;


    public abstract class Shape {
        private String type; // circle, rectangle, etc.

        public Shape(String type) {
            this.type = type;
        }

        public void calculateArea() {
            System.out.println("Add your implementation!");
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        @Override
        public String toString() {
            return "Type: " + this.type;
        }


        public abstract void calculatePerimeter();
    }
