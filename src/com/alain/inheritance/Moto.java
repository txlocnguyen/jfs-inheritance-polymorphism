package com.alain.inheritance;

public class Moto extends Vehicle {
    private int numOfSeats;

    public Moto(int numOfSeats, int topSpeed, String color, String make, String model, boolean isElectric) {
        super(topSpeed, color, make, model, isElectric);
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return "Moto { " +
                "numOfSeats = " + numOfSeats +
                ", topSpeed = " + getTopSpeed() +
                ", currentSpeed = " + getTopSpeed() +
                ", color = '" + getColor() + '\'' +
                ", make = '" + super.getMake() + '\'' +
                ", model = '" + super.getModel() + '\'' +
                ", isElectric = " + super.getIsElectric() +
                '}';
    }
}
