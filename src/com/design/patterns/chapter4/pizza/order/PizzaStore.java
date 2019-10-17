package com.design.patterns.chapter4.pizza.order;

import com.design.patterns.chapter4.pizza.factory.SimplePizzaFactory;
import com.design.patterns.chapter4.pizza.product.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
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
}
