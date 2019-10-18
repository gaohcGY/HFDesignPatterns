package com.design.patterns.chapter4.pizza.product;

import com.design.patterns.chapter4.pizza.factory.ChicagoPizzaIngredientFactory;
import com.design.patterns.chapter4.pizza.factory.PizzaIngredientFactory;
import com.design.patterns.chapter4.pizza.product.base.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
