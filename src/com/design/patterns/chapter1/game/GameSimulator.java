package com.design.patterns.chapter1.game;

import com.design.patterns.chapter1.game.base.Charackter;
import com.design.patterns.chapter1.game.behavior.instance.AxeBehavior;
import com.design.patterns.chapter1.game.behavior.instance.BowAndArrowBehavior;
import com.design.patterns.chapter1.game.persons.King;
import com.design.patterns.chapter1.game.persons.Knight;

/**
 * Created by gaohc on 2019/10/11.
 */
public class GameSimulator {

    public static void main(String[] args) {
        Charackter charackter = new King();
        charackter.fight();

        Charackter charackter1 = new Knight();
        charackter1.fight();
        charackter1.setWeaponBehavior(new BowAndArrowBehavior());
        charackter1.fight();
    }
}
