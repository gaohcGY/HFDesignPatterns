package com.design.patterns.chapter7.decorate.animal;

import com.design.patterns.chapter7.decorate.animal.adapter.DuckAdapter;
import com.design.patterns.chapter7.decorate.animal.adapter.TurkeyAdapter;
import com.design.patterns.chapter7.decorate.animal.duck.Duck;
import com.design.patterns.chapter7.decorate.animal.duck.MallardDuck;
import com.design.patterns.chapter7.decorate.animal.turkey.Turkey;
import com.design.patterns.chapter7.decorate.animal.turkey.WildTurkey;

/**
 * Created by gaohc on 2019/10/28.
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        Turkey duckAdapter = new DuckAdapter(mallardDuck);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("\nThe DuckAdapter says...");
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
