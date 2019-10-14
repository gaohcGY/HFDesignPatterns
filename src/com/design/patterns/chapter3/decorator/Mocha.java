package com.design.patterns.chapter3.decorator;

import com.design.patterns.chapter3.base.Beverage;
import com.design.patterns.chapter3.base.CondimentDecorator;

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
