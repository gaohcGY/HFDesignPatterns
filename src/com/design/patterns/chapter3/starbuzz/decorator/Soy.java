package com.design.patterns.chapter3.starbuzz.decorator;

import com.design.patterns.chapter3.starbuzz.base.Beverage;
import com.design.patterns.chapter3.starbuzz.base.CondimentDecorator;

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
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += .10;
        } else if (getSize() == Beverage.GRANDE) {
            cost += .15;
        } else if (getSize() == Beverage.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
