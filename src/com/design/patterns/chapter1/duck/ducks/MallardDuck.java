package com.design.patterns.chapter1.duck.ducks;

import com.design.patterns.chapter1.duck.base.Duck;
import com.design.patterns.chapter1.duck.behavior.instance.FlyWithWings;
import com.design.patterns.chapter1.duck.behavior.instance.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Head is Green");
    }
}
