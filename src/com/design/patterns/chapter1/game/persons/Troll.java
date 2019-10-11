package com.design.patterns.chapter1.game.persons;

import com.design.patterns.chapter1.game.base.Charackter;
import com.design.patterns.chapter1.game.behavior.instance.AxeBehavior;
import com.design.patterns.chapter1.game.behavior.instance.BowAndArrowBehavior;

/**
 * Created by gaohc on 2019/10/11.
 */
public class Troll extends Charackter {

    public Troll() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
