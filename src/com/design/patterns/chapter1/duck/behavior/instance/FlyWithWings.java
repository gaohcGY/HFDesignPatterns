package com.design.patterns.chapter1.duck.behavior.instance;

import com.design.patterns.chapter1.duck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
