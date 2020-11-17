package com.company;

public abstract class Vehicle {
    private int numberOfWheels;
    private int maxSpeed;
    private String color;

    private static int vechiclesProduced = 12;

    public Vehicle(int numberOfWheels, String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numberOfWheels = numberOfWheels;
    }

    public Vehicle() {
    }

    public static int getVechiclesProduced() {
        return vechiclesProduced;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void drive();
}
