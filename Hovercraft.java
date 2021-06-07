package com.mycompany.vehicle;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    public void enterLand() {
        System.out.println("Enter land");
    }

    public void enterSea() {
        System.out.println("Enter sea");
    }

    @Override
    public int numWheels() {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println("Driving a Hovercraft");
    }

    @Override
    public double displacement() {
        return 0;
    }

    @Override
    public void launch() {
        System.out.println("Launching a Hovercraft");
    }
}
