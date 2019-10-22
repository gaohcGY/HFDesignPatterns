package com.design.patterns.chapter6.remote.device;

public class GarageDoor {

    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " Garage Door is Open");
    }

    public void down() {
        System.out.println(location + " Garage Door is Close");
    }

    public void stop() {
        System.out.println(location + " Garage Door is Stop");
    }

    public void lightOn() {
        System.out.println(location + " Garage Door is Light On");
    }

    public void lightOff() {
        System.out.println(location + " Garage Door is Light Off");
    }
}
