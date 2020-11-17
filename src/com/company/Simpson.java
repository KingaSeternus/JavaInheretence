package com.company;

public abstract class Simpson extends Motorbike {
    static private final int MAX_SPEED = 100;

    public Simpson(String color) {

        super(color, MAX_SPEED);
    }

    @Override
    public void drive() {

        System.out.println("Yamaha colored " + getColor() + " is driving with " + getMaxSpeed() + "km/h");
    }
}
