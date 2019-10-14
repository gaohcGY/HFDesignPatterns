package com.design.patterns.chapter3;

import com.design.patterns.chapter3.base.Beverage;
import com.design.patterns.chapter3.coffee.DarkRoast;
import com.design.patterns.chapter3.coffee.Espresso;
import com.design.patterns.chapter3.coffee.HousBlend;
import com.design.patterns.chapter3.decorator.Mocha;
import com.design.patterns.chapter3.decorator.Soy;
import com.design.patterns.chapter3.decorator.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HousBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
