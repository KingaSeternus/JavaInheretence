package com.company;

public class Yamaha extends Motorbike {
    static private final int MAX_SPEED = 300;

    public Yamaha(String color) {

        super(color, MAX_SPEED);
    }

    @Override
    public void drive() {

        System.out.println("Yamaha colored "+getColor()+" is driving with "+getMaxSpeed()+"km/h");
    }
}
