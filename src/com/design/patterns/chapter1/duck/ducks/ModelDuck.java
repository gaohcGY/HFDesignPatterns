package com.design.patterns.chapter1.duck.ducks;

import com.design.patterns.chapter1.duck.base.Duck;
import com.design.patterns.chapter1.duck.behavior.instance.FlyNoWay;
import com.design.patterns.chapter1.duck.behavior.instance.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
