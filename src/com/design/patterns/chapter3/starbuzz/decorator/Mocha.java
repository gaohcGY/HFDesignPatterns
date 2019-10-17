package com.design.patterns.chapter3.starbuzz.decorator;

import com.design.patterns.chapter3.starbuzz.base.Beverage;
import com.design.patterns.chapter3.starbuzz.base.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
