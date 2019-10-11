package com.design.patterns.chapter1.game.behavior.instance;

import com.design.patterns.chapter1.game.behavior.WeaponBehavior;

/**
 * Created by gaohc on 2019/10/11.
 */
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("use axe");
    }
}
