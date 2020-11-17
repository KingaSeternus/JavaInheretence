package com.company;

public abstract class Polonez extends Car {
    static private final int MAX_SPEED = 200;

    public Polonez (String color){
        super(color, MAX_SPEED);
    }

    @Override
    public void drive() {
        System.out.println("Polonez colored "+getColor()+" is driving with "+getMaxSpeed()+"km/h");
    }
}
