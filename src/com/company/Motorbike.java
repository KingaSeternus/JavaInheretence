package com.company;

public abstract class Motorbike extends Vehicle {
    private static final int NUMBER_OF_WHEELS = 2;

    public Motorbike(String color, int maxSpeed) {
        super(NUMBER_OF_WHEELS , color, maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("Motorbike colored"+getColor()+"have"+getNumberOfWheels()+"is driving with"+getMaxSpeed());
    }

    }


