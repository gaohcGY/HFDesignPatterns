package com.design.patterns.chapter7.decorate.animal.duck;

/**
 * Created by gaohc on 2019/10/28.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
