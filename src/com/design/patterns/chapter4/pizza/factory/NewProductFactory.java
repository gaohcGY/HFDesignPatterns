package com.design.patterns.chapter4.pizza.factory;


import com.design.patterns.chapter4.pizza.ingredient.base.Peanut;

public interface NewProductFactory extends PizzaIngredientFactory {

    Peanut createPeanut();
}
