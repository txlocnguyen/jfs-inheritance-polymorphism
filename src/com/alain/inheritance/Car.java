package com.alain.inheritance;

public class Car extends Vehicle{
    private int numDoors;

    public Car(int numDoors, int topSpeed, String color, String make, String model, boolean isElectric) {
        super(topSpeed, color, make, model, isElectric);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "numDoors = " + numDoors +
                ", topSpeed = " + super.getTopSpeed() +
                ", currentSpeed = " + super.getCurrentSpeed() +
                ", color = '" + super.getColor() + '\'' +
                ", make = '" + super.getMake() + '\'' +
                ", model = '" + super.getModel() + '\'' +
                ", isElectric = " + super.getIsElectric() +
                '}';
    }
}
