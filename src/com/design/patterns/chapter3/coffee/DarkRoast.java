package com.design.patterns.chapter3.coffee;

import com.design.patterns.chapter3.base.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DartRoast";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
