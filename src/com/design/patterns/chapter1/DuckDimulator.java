package com.design.patterns.chapter1;

import com.design.patterns.chapter1.duck.behavior.instance.FlyRocketPowered;
import com.design.patterns.chapter1.duck.ducks.MallardDuck;
import com.design.patterns.chapter1.duck.base.Duck;
import com.design.patterns.chapter1.duck.ducks.ModelDuck;

public class DuckDimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
