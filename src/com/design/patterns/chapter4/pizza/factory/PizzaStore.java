package com.design.patterns.chapter4.pizza.factory;

import com.design.patterns.chapter4.pizza.product.base.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        if (pizza == null) {
            System.out.println("you order has not implements, we will try is in feature");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
