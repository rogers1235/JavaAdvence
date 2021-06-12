package com.sda.javaadvenceexercises.ex13;

import java.util.List;

public class Main {
    /**
     * Create a CarService class that will contain a list of cars and implement the following methods:
     * 1.adding cars to the list,
     * 2.removing a car from the list,
     * 3.returning a list of all cars,
     * 4.returning cars with a V12 engine,
     * 5.returning cars produced before 1999,
     * 6.returning the most expensive car,
     * 7.returning the cheapest car,
     * 8.returning the carList with brand,
     * 9.returning a list of all cars sorted according to the passed parameter: ascending / descending,
     * 10.checking if a specific car is on the list,
     * 11.returning a list of cars manufactured by a specific manufacturer,
     * 12.returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
     */

    public static void main(String[] args) {
 CarService carService = new CarService();
 //adding cars
        Car car1 = new Car("v12", 1998,"Dacia " ,1238);
        carService.addCarsToTheList(car1);

        carService.addCarsToTheList(new Car("v6",2005,"Audi",3000));
        carService.addCarsToTheList(new Car("v8",2006,"BMW",4000));
        carService.addCarsToTheList(new Car( "v12",2009,"Mustang",12000));
        carService.addCarsToTheList(new Car( "1.6",1958, "Trabant",250));

        // remove car1 from the List
        carService.removeCarFromTheList(car1);
      //  carService.removeCarFromTheList(carService.getCarsList().get(2));
      // remove car index from list at index 2


        //get data
        printResults(carService.getCarsList());

       carService.addCarsToTheList(car1);



       List<Car> carWithv12Engine = carService.getCarsWithEngineV12();
       printResults(carWithv12Engine);

        System.out.println("----------------");


       printResults(carService.getCarsWithEngineV12());
        System.out.println("---------------");

        List< Car> carListBefore1999 = carService.getCarsManufacturedBefore(1999);
        printResults(carListBefore1999);

        System.out.println("--------------------");


    }

    public static void printResults(List<Car> carList){
        carList.stream().forEach((Car car) -> System.out.println(car.toString()));

    }
}
