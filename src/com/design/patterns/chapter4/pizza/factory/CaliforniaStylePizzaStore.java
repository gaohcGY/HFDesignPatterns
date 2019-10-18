package com.design.patterns.chapter4.pizza.factory;

import com.design.patterns.chapter4.pizza.product.*;
import com.design.patterns.chapter4.pizza.product.base.Pizza;

public class CaliforniaStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CaliforniaStyleCheesePizza(ingredientFactory);
                pizza.setName("California Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new CaliforniaStyleVeggiePizza(ingredientFactory);
                pizza.setName("California Style Veggie Pizza");
                break;
            case "clam":
                pizza = new CaliforniaStyleClamPizza(ingredientFactory);
                pizza.setName("California Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new CaliforniaStylePepperoniPizza(ingredientFactory);
                pizza.setName("California Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
