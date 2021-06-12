package com.sda.cristi.javafundamentaladvence.cristi.exercises.threads;

public class Main {

    public static void main(String[] args) {
        ThreadSample threadSample = new ThreadSample( 43);
        Thread thread = new Thread( threadSample);
        thread.start();
        threadSample.setValue(312);


        ThreadSample threadSample1 = new ThreadSample(54);
        Thread thread1 = new Thread(threadSample1);
        thread1.start();

        ThreadSample threadSample2;
        threadSample2 = new ThreadSample(23);
        Thread thread2 = new Thread(threadSample2);
        thread2.start();

        ThreadSample threadSample3 = new ThreadSample(7);
        Thread thread3 = new Thread(threadSample3);
        thread3.start();
    }

}
