package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Moped slowRide = new Moped("Blue", 2, 5, 15);
        System.out.printf("A mopped in color %s with %s fuel capacity.\n", slowRide.getColor(), slowRide.getFuelCapacity());

        Car car = new Car("Blue", 4, 20, 55);
        System.out.printf("A car that fits %s people and %s fuel capacity.\n", car.getNumOfPassengers(), car.getFuelCapacity());

        SemiTruck semiTruck = new SemiTruck("Blue", 3, 500, 150);
        System.out.printf("A semi truck in color %s with %s cargo capacity.\n", semiTruck.getColor(), semiTruck.getCargoCapacity());

        Hovercraft hovercraft = new Hovercraft("Blue", 4, 4, 80);
        System.out.printf("A hovercraft in color %s with %s cargo capacity.", hovercraft.getColor(), hovercraft.getCargoCapacity());

    //  YOu are able to access them because the parent class is extend to the child class.
    }
}
