package com.design.patterns.chapter1.duck.behavior.instance;

import com.design.patterns.chapter1.duck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!!!");
    }
}
