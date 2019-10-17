package com.design.patterns.chapter3.starbuzz.coffee;

import com.design.patterns.chapter3.starbuzz.base.Beverage;

public class Decat extends Beverage {

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return .5;
    }
}
