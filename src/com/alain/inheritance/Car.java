package com.alain.inheritance;

public class Car extends Vehicle {
    //TODO Create your instance variable here
    private int numDoors;

    //TODO Create your constructor here
    public Car(int topSpeed, String color, String make, String model, boolean isElectric, int numDoors) {
        super(topSpeed, color, make, model, isElectric);
        this.numDoors = numDoors;
    }

    //TODO Create your getter and setter here
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    //TODO Create a toString() method here to print out the values of instances of Car
    public String toString() {
        return "This " + this.getColor() + " " + this.getMake() + " " + this.getModel() + " has a top speed of " + this.getTopSpeed() +
                " and it is " + (this.getisElectric() ? "" : "not ") + "electric and it has " + this.getNumDoors() +
                " doors";
    }
}
