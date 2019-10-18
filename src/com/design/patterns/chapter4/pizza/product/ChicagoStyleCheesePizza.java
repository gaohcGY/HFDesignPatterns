package com.design.patterns.chapter4.pizza.product;

import com.design.patterns.chapter4.pizza.factory.PizzaIngredientFactory;
import com.design.patterns.chapter4.pizza.product.base.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
//        name = "Chicago Style Deep Dish Cheese Pizza";
//        dough = "Extra Thick Crust Dough";
//        sauce = "Plum Tomato Sauce";
//
//        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
