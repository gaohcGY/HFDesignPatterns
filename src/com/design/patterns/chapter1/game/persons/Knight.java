package com.design.patterns.chapter1.game.persons;

import com.design.patterns.chapter1.game.base.Charackter;
import com.design.patterns.chapter1.game.behavior.instance.AxeBehavior;

/**
 * Created by gaohc on 2019/10/11.
 */
public class Knight extends Charackter {

    public Knight() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
