package com.alain.inheritance;

public class Vehicle {
    private int topSpeed;
    private int currentSpeed = 0;
    private String color;
    private String make;
    private String model;
    private boolean isElectric;

    public Vehicle(int topSpeed, String color, String make, String model, boolean isElectric) {
        this.topSpeed = topSpeed;
        this.color = color;
        this.make = make;
        this.model = model;
        this.isElectric = isElectric;
    }



    public int getTopSpeed() {
        return topSpeed;
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

    public boolean getIsElectric() {
        return isElectric;
    }
    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void increaseSpeed() {
        if(currentSpeed + 10 > topSpeed) {
            throw new IllegalStateException("Top Speed exceeded");
        }
        currentSpeed += 10;
    }

    public void decreaseSpeed() {
        if(currentSpeed - 10 < 0) {
            currentSpeed = 0;
        }
        else {
            currentSpeed -= 10;
        }
    }

    @Override
    public String toString() {
        return "Vehicle + {" +
                "topSpeed = " + topSpeed +
                ", currentSpeed = " + currentSpeed +
                ", color = '" + color + '\'' +
                ", make = '" + make + '\'' +
                ", model = '" + model + '\'' +
                ", isElectric = " + isElectric +
                '}';
    }

}
