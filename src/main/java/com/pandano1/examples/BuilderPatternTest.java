package com.pandano1.examples;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Car c = Car.customCar.setColor("Red").setModel("dd").build();
        System.out.println(c.toString());
    }



}
