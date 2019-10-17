package com.design.patterns.chapter3.starbuzz.decorator;

import com.design.patterns.chapter3.starbuzz.base.Beverage;
import com.design.patterns.chapter3.starbuzz.base.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .40 + beverage.cost();
    }
}
