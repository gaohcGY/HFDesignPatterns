package com.design.patterns.chapter6.remote.device;

public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Light is On");
    }

    public void off() {
        System.out.println(location + " Light is Off");
    }
}
