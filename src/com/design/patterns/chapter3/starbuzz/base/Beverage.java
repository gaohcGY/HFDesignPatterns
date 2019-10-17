package com.design.patterns.chapter3.starbuzz.base;

public abstract class Beverage {

    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    protected String description = "Unknown Beverage";
    protected int size = TALL; // default TALL

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract double cost();
}
