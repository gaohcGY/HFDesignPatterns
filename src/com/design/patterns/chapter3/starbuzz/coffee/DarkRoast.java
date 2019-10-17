package com.design.patterns.chapter3.starbuzz.coffee;

import com.design.patterns.chapter3.starbuzz.base.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DartRoast";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
