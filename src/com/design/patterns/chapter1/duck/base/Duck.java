package com.design.patterns.chapter1.duck.base;

import com.design.patterns.chapter1.duck.behavior.FlyBehavior;
import com.design.patterns.chapter1.duck.behavior.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public Duck() {

    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performQuack() {
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
}
