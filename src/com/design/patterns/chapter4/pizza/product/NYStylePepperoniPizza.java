package com.design.patterns.chapter4.pizza.product;

import com.design.patterns.chapter4.pizza.factory.PizzaIngredientFactory;
import com.design.patterns.chapter4.pizza.product.base.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("PrePareing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
        clam = ingredientFactory.createClam();
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
