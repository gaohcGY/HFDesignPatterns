package com.design.patterns.chapter3.starbuzz;

import com.design.patterns.chapter3.starbuzz.base.Beverage;
import com.design.patterns.chapter3.starbuzz.coffee.DarkRoast;
import com.design.patterns.chapter3.starbuzz.coffee.Espresso;
import com.design.patterns.chapter3.starbuzz.coffee.HousBlend;
import com.design.patterns.chapter3.starbuzz.decorator.Mocha;
import com.design.patterns.chapter3.starbuzz.decorator.Soy;
import com.design.patterns.chapter3.starbuzz.decorator.Whip;

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
//        beverage2 = new Mocha(beverage2);
        beverage2.setSize(Beverage.GRANDE);
//        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
