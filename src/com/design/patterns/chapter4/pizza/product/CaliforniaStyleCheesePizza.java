package com.design.patterns.chapter4.pizza.product;

public class CaliforniaStyleCheesePizza extends Pizza {

    public CaliforniaStyleCheesePizza() {
        name = "California Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Grinding iron Cheese");
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
