package com.alain.inheritance;

public class Main {
    public static void main(String[] args) {

        Car carOne = new Car(4, 210, "white", "mercedes", "cls", false);
        System.out.println(carOne.toString());
        carOne.increaseSpeed();
        System.out.println(carOne.getCurrentSpeed());
        carOne.increaseSpeed();
        System.out.println(carOne.getCurrentSpeed());
        carOne.decreaseSpeed();
        System.out.println(carOne.getCurrentSpeed());
//        carOne.increaseSpeed(140);
//        System.out.println(carOne.getCurrentSpeed());
        Moto motoOne = new Moto(2, 225, "Black", "Yamaha", "R1", false);
        System.out.println(motoOne);
        motoOne.increaseSpeed();
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
    }
}
