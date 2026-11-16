package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle {
    private String color;
    private int numOfPassengers;
    private double cargoCapacity;
    private double fuelCapacity;

    public Vehicle(){}

    public Vehicle(String color, int numOfPassengers, double cargoCapacity, double fuelCapacity) {
        this.color = color;
        this.numOfPassengers = numOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
}
