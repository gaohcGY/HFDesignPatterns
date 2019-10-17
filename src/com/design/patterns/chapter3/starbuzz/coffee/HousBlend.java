package com.design.patterns.chapter3.starbuzz.coffee;

import com.design.patterns.chapter3.starbuzz.base.Beverage;

public class HousBlend extends Beverage {

    public HousBlend() {
        description = "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
