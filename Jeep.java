package com.mycompany.vehicle;

public class Jeep extends Vehicle implements LandVehicle {
    public void soundHorn() {
        System.out.println("Honk of a Jeep");
    }

    @Override
    public int numWheels() {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println("Driving a Jeep");
    }
}
