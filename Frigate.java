package com.mycompany.vehicle;

public class Frigate extends Vehicle implements SeaVessel {
    public void fireGun() {
        System.out.println("Firing a Frigate");
    }

    @Override
    public double displacement() {
        return 0;
    }

    @Override
    public void launch() {
        System.out.println("Launching a Frigate");
    }
}
