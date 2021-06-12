package com.sda.javaadvenceexercises.ex7;

import java.util.ArrayList;
import java.util.List;

public class WeaponMagazine {

    private int size;
    private List<String> magazines;


    public WeaponMagazine(int size){
        this.size = size;
        this.magazines = new ArrayList<>();
    }
    public void  loadBullet(String bullet){
      if (magazines.size() <= size){
          this.magazines.add(bullet);
      }else{
          System.out.println("The magazine is overloaded");
      }
    }
    public boolean isLoaded(){
  //      if (this.magazine.size() > 0){
   //         return true;
   //     }else{
   //         return false;
     //   }
        return this.magazines.size() > 0;
    }
    public void shot(){

        if (this.isLoaded()){
            System.out.println(magazines.get(this.magazines.size() - 1));
            System.out.println("Take care, the next bullet is loaded");
            magazines.remove(this.magazines.size() - 1);

           }else{
            System.out.println("Empty magazine");
        }

    }
}
