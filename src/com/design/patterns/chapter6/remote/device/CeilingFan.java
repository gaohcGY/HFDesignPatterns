package com.design.patterns.chapter6.remote.device;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " CeilingFan is High");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " CeilingFan is Medium");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " CeilingFan is Low");
    }

    public void on() {
        System.out.println(location + " CeilingFan is On");
    }

    public void off() {
        System.out.println(location + " CeilingFan is Off");
        speed = OFF;
    }

    public int getSpeed() {
        return this.speed;
    }
}
