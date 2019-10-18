package com.design.patterns.chapter4.pizza.product;

import com.design.patterns.chapter4.pizza.factory.PizzaIngredientFactory;
import com.design.patterns.chapter4.pizza.product.base.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CaliforniaStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    public void bake() {
        System.out.println("Bake for 55 minutes at 300");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}
