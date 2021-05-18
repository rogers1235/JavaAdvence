package com.sda.cristi.exercises.threads;

public class ThreadSample implements Runnable {
    private int value;
    ThreadSample(int value){

    }

  @Override
    public  void run(){
        while(true) {
            System.out.println("Hello");
           try{
               Thread.sleep( 5000);

           }catch (Exception e){
               System.out.println(e.getMessage());
           }

        }
    }
    public  void  setValue(int value){
        this.value = value;
    }
}
