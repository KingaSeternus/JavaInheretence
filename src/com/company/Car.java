package com.company;

public abstract class Car extends Vehicle {
    private static final int NUMBER_OF_WHEELS = 4;

    public Car(String color, int maxSpeed) {
        super(NUMBER_OF_WHEELS, color, maxSpeed);

    }
}
