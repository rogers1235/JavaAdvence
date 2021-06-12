package com.sda.cristi.javafundamentaladvence.cristi.threads;


    public class SeatTakerThread extends Thread {

        private Bench bench;

        public SeatTakerThread(Bench bench) {
            this.bench = bench;
        }

        @Override
        public void run() {
            this.bench.takeASeat();
        }
}
