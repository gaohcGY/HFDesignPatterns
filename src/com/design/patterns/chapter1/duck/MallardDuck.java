package com.design.patterns.chapter1.duck;

import com.design.patterns.chapter1.duck.base.Duck;
import com.design.patterns.chapter1.duck.instance.FlyWithWings;
import com.design.patterns.chapter1.duck.instance.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("Head is Green");
    }
}
