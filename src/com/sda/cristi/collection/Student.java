package com.sda.cristi.collection;


    public class Student implements IPerson {
        public String name;





        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public void sayHello() {
            System.out.println("SayHello from Student Class.");
        }

        @Override
        public void sayGoodbye() {
            System.out.println("Pa pa!!! pe saptamana viitoare!");
        }
    }

