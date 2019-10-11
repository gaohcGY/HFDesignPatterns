package com.design.patterns.chapter1.game.persons;

import com.design.patterns.chapter1.game.base.Charackter;
import com.design.patterns.chapter1.game.behavior.instance.KnifeBehavior;

/**
 * Created by gaohc on 2019/10/11.
 */
public class Queen extends Charackter {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
