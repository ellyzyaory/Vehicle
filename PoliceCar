package com.mycompany.vehicle;

public class PoliceCar extends Vehicle implements Emergency, LandVehicle {
    private String name;
    private String license;
    private double fuel;
    private double speed;

    public PoliceCar(String name, String license, double fuel, double v) {
        this.name = name;
        this.license = license;
        this.fuel = fuel;
        this.speed = v;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public int numWheels() {
        return 0;
    }

    @Override
    public void drive() {
        System.out.println("Driving a police car");
    }

    @Override
    public void soundSiren() {
        System.out.println("Siren of a police car");
    }

    @Override
    public String toString() {
        return '{' + "name= " + name + ", license= " + license + ", fuel= " + fuel + ",  speed= " + speed + '}';
    }

}
