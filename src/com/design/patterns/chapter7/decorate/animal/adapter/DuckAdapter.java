package com.design.patterns.chapter7.decorate.animal.adapter;

import com.design.patterns.chapter7.decorate.animal.duck.Duck;
import com.design.patterns.chapter7.decorate.animal.turkey.Turkey;

/**
 * Created by gaohc on 2019/10/28.
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
