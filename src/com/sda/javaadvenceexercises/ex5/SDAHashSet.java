package com.sda.javaadvenceexercises.ex5;

import java.util.ArrayList;
import java.util.List;

public class SDAHashSet <E> implements HashSet <E> {

    private List<E>itemsList ;
  public  SDAHashSet(){
      super();
      this.itemsList = new ArrayList<>();

  }



    @Override
    public void add(E item) {

      if (!this.itemsList.contains(item)){
          this.itemsList.add(item);

      }else{

          //metoda indexOf ne returneaza pozitia curenta din lista  elementului
        int index =  this.itemsList.indexOf(item);
        //metoda set setteaza elementul pe o anumita pozitie
        this.itemsList.set(index, item);
      }


    }

    @Override
    public void remove(E item) {
      this.itemsList.remove(item);



    }
    @Override
    public void clear() {
this.itemsList.clear();

    }

    @Override
    public int size() {
     return this.itemsList.size();


    }

    @Override
    public boolean contains(E item) {
        return this.itemsList.contains(item);
    }



    // private Set<E> sdaSet = new java.util.HashSet<E>();

 //   @Override
 //   public void add(E item) {
   //     sdaSet.add(item);
  //  }

 //   @Override
  //  public void remove(E item) {
   //     sdaSet.remove(item);
   // }

  //  @Override
  //  public int size(E item) {
   //     return sdaSet.size();
  //  }

  //  @Override
   // public boolean contains(E item) {
      //  return sdaSet.contains(item);
 //   }

 //   @Override
   // public void clear(E item) {
      //  sdaSet.clear();
    //}
}
