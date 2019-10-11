package com.design.patterns.chapter1.duck.instance;

import com.design.patterns.chapter1.duck.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack!!! quack!!!");
    }
}
