package com.design.patterns.chapter4.pizza.factory;

import com.design.patterns.chapter4.pizza.product.*;

public class CaliforniaStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        }
        return null;
    }
}
