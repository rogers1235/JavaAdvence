package com.sda.cristi.javafundamentaladvence.cristi.threads;


    public class StopWatchThreadInterface implements Runnable {
        private String name;

        public StopWatchThreadInterface(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                for(int i = 10; i > 0; i--) {
                    Thread.sleep(1000);
                    System.out.println(this.name + " time: " + i);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

}
