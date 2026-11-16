package com.pluralsight;

public class Car extends Vehicle{
    private int vin;
    private String fuelType;

    public Car(String color, int numOfPassengers, double cargoCapacity, double fuelCapacity) {
        super(color, numOfPassengers, cargoCapacity, fuelCapacity);
    }
}
