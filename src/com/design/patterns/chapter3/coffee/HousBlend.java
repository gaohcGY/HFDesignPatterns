package com.design.patterns.chapter3.coffee;

import com.design.patterns.chapter3.base.Beverage;

public class HousBlend extends Beverage {

    public HousBlend() {
        description = "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
