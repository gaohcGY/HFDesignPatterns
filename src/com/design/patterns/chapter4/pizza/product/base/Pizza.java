package com.design.patterns.chapter4.pizza.product.base;

import com.design.patterns.chapter4.pizza.ingredient.base.*;

import java.util.ArrayList;

public abstract class Pizza {

    private String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;


    public abstract void prepare();
//    public void prepare() {
//        System.out.println("Preparing " + name);
//        System.out.println("Tossing dough...");
//        System.out.println("Adding sauce...");
//        System.out.println("Adding toppings: ");
//        for (int i = 0; i < toppings.size(); i++) {
//            System.out.println("   " + toppings.get(i));
//        }
//    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
