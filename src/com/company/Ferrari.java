package com.company;

public abstract class Ferrari extends Car {
    static private final int MAX_SPEED = 400;

    public Ferrari (String color){
        super(color, MAX_SPEED);
    }

    @Override
    public void drive() {
        System.out.println("Ferrari colored "+getColor()+" is driving with "+getMaxSpeed()+"km/h");
    }
}
