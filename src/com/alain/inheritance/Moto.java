package com.alain.inheritance;

public class Moto extends Vehicle {

    //TODO Create your instance field here
    private int numOfSeats;


    //TODO Create your contructor here
    public Moto(int topSpeed, String color, String make, String model, boolean isElectric, int numOfSeats) {
        super(topSpeed, color, make, model, isElectric);
        this.numOfSeats = numOfSeats;
    }


    //TODO Create your getter and setter here
    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }


    //TODO Create your increaseSpeed method here
    @Override
    public void increaseSpeed() {
        int newSpeed = this.getCurrentSpeed() + 20;
        if (newSpeed > this.getTopSpeed()) {
            newSpeed = this.getTopSpeed();
        }
        this.setCurrentSpeed(newSpeed);
    }

    public String toString() {
        return "This " + this.getColor() + " " + this.getMake() + " " + this.getModel() + " has a top speed of " + this.getTopSpeed() +
                " and it is " + (this.getisElectric() ? "" : "not ") + "electric and it has " + this.getNumOfSeats() +
                " seats";
    }
}
