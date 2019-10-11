package com.design.patterns.chapter1.game.base;

import com.design.patterns.chapter1.game.behavior.WeaponBehavior;

public abstract class Charackter {

    protected WeaponBehavior weaponBehavior;


    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }

    public abstract void fight();
}
