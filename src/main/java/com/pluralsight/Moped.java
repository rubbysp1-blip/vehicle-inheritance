package com.pluralsight;

public class Moped extends Vehicle{
    private int handles;
    private int numOfLights;

    public Moped(String color, int numOfPassengers, double cargoCapacity, double fuelCapacity) {
        super(color, numOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Moped(){
        super();
    }
}
