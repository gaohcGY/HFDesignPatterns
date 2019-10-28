package com.design.patterns.chapter7.decorate.animal.adapter;

import com.design.patterns.chapter7.decorate.animal.duck.Duck;
import com.design.patterns.chapter7.decorate.animal.turkey.Turkey;

/**
 * Created by gaohc on 2019/10/28.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
