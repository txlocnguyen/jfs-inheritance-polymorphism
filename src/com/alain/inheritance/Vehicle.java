package com.alain.inheritance;


public class Vehicle {
    private int topSpeed;
    //TODO  Add other instance variables here
    private int currentSpeed = 0;
    private String color;
    private String make;
    private String model;
    private boolean isElectric;

    //TODO Create your constructor here
    public Vehicle(int topSpeed, String color, String make, String model, boolean isElectric) {
        this.topSpeed = topSpeed;
        this.currentSpeed = 0;
        this.color = color;
        this.make = make;
        this.model = model;
        this.isElectric = isElectric;
    }


    //TODO Create your getters and setters here
    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getisElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }


    //TODO Create your increaseSpeed() method here
    public void increaseSpeed() {
        int newSpeed = this.getCurrentSpeed() + 10;
        if (newSpeed > this.getTopSpeed()) {
            newSpeed = this.getTopSpeed();
        }
        this.setCurrentSpeed(newSpeed);
    }

    //TODO Create your decreaseSpeed() method here
    public void decreaseSpeed() {
        int newSpeed = this.getCurrentSpeed() - 10;
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        this.setCurrentSpeed(newSpeed);
    }

    //TODO Create a toString() method here to print the values of your objects
    public String toString() {
        return "This " + this.getColor() + " " + this.getMake() + " " + this.getModel() + " has a top speed of " + this.getTopSpeed() +
                " and it is " + (this.getisElectric() ? "" : "not ") + "electric";
    }

}
