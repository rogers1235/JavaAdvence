package com.sda.cristi.javafundamentaladvence.cristi.gererictypes;


    public class GenericCup <T> {
        private T item;

        public GenericCup(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

