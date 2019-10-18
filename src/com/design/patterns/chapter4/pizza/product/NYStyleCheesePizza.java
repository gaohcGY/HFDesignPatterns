package com.design.patterns.chapter4.pizza.product;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

//    @Override
//    public void prepare() {
//        System.out.println("NY stryle cheese Pizza preparing~!");
//    }
//
//    @Override
//    public void bake() {
//        System.out.println("NY stryle cheese Pizza bake~!");
//    }
//
//    @Override
//    public void cut() {
//        System.out.println("NY stryle cheese Pizza cut~!");
//    }
//
//    @Override
//    public void box() {
//        System.out.println("NY stryle cheese Pizza boxed~!");
//    }
}
