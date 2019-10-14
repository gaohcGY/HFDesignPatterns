package com.design.patterns.chapter3.decorator;

import com.design.patterns.chapter3.base.Beverage;
import com.design.patterns.chapter3.base.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
