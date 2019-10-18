package com.design.patterns.chapter4.pizza.factory;

import com.design.patterns.chapter4.pizza.ingredient.*;
import com.design.patterns.chapter4.pizza.ingredient.base.*;
import com.design.patterns.chapter4.pizza.product.MozzarellaCheese;
import com.design.patterns.chapter4.pizza.product.PlumTomatoSauce;

public class CaliforniaPizzaIngredientFactory implements NewProductFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new BlackOlives(), new Spinach(), new Eggplant() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

    @Override
    public Peanut createPeanut() {
        return new FriedPeanut();
    }
}
