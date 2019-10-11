package com.design.patterns.chapter1.duck.behavior.instance;

import com.design.patterns.chapter1.duck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
