package com.pluralsight;

public class Moped extends Vehicle{
    private int handles;
    private int numOfLights;

    public Moped(String color, int numOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Moped(){
        super();
    }

    public int getHandles() {
        return handles;
    }

    public void setHandles(int handles) {
        this.handles = handles;
    }

    public int getNumOfLights() {
        return numOfLights;
    }

    public void setNumOfLights(int numOfLights) {
        this.numOfLights = numOfLights;
    }
}
