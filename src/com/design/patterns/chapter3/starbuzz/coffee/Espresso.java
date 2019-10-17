package com.design.patterns.chapter3.starbuzz.coffee;

import com.design.patterns.chapter3.starbuzz.base.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
