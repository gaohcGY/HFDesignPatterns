package com.design.patterns.chapter4.pizza;

import com.design.patterns.chapter4.pizza.factory.CaliforniaStylePizzaStore;
import com.design.patterns.chapter4.pizza.factory.ChicagoStylePizzaStore;
import com.design.patterns.chapter4.pizza.factory.NYStylePizzaStore;
import com.design.patterns.chapter4.pizza.factory.PizzaStore;
import com.design.patterns.chapter4.pizza.product.base.Pizza;

public class PizzaTestDrie {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        PizzaStore californiaStore = new CaliforniaStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());

        System.out.println();
        pizza = californiaStore.orderPizza("cheese");
        System.out.println("I'm ordered a " + pizza.getName());
    }
}
