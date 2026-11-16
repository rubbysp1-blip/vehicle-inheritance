package com.pluralsight;

public class SemiTruck extends Vehicle{
    private String engine;
    private int trailerSize;

    public SemiTruck(String color, int numOfPassengers, double cargoCapacity, double fuelCapacity) {
        super(color, numOfPassengers, cargoCapacity, fuelCapacity);
    }
}
