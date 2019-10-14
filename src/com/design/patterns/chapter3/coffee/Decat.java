package com.design.patterns.chapter3.coffee;

import com.design.patterns.chapter3.base.Beverage;

public class Decat extends Beverage {

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return .5;
    }
}
