package com.design.patterns.chapter1.duck.base;

import com.design.patterns.chapter1.duck.behavior.FlyBehavior;
import com.design.patterns.chapter1.duck.behavior.QuackBehavior;

public class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public Duck() {

    }

    public void performQuack() {
        System.out.println("quack");
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
    public void swim() {
        System.out.println("I'm swimming");
    }

    public void display() {

    }



//    protected abstract void display();
}
