package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Blue");
        slowRide.setFuelCapacity(15);

        System.out.printf("A mopped in color %s with %s fuel capacity.\n", slowRide.getColor(), slowRide.getFuelCapacity());

        Car car = new Car();
        car.setNumOfPassengers(4);
        car.setFuelCapacity(55);

        System.out.printf("A car that fits %s people and %s fuel capacity.\n", car.getNumOfPassengers(), car.getFuelCapacity());

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("Red");
        semiTruck.setCargoCapacity(1500);

        System.out.printf("A semi truck in color %s with %s cargo capacity.\n", semiTruck.getColor(), semiTruck.getCargoCapacity());

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Orange");
        hovercraft.setCargoCapacity(15);

        System.out.printf("A hovercraft in color %s with %s cargo capacity.", hovercraft.getColor(), hovercraft.getCargoCapacity());
    }
}
