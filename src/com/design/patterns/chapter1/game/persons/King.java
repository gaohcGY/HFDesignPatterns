package com.design.patterns.chapter1.game.persons;

import com.design.patterns.chapter1.game.base.Charackter;
import com.design.patterns.chapter1.game.behavior.instance.SwordBehavior;

/**
 * Created by gaohc on 2019/10/11.
 */
public class King extends Charackter {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
