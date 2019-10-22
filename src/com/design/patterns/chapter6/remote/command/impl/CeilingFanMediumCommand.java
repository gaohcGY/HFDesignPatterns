package com.design.patterns.chapter6.remote.command.impl;

import com.design.patterns.chapter6.remote.command.Command;
import com.design.patterns.chapter6.remote.device.CeilingFan;

public class CeilingFanMediumCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        if (ceilingFan != null) {
            prevSpeed = ceilingFan.getSpeed();
            ceilingFan.medium();
        }
    }

    @Override
    public void undo() {
        if (ceilingFan != null) {
            switch (prevSpeed) {
                case CeilingFan.HIGH:
                    ceilingFan.high();
                    break;
                case CeilingFan.MEDIUM:
                    ceilingFan.medium();
                    break;
                case CeilingFan.LOW:
                    ceilingFan.low();
                    break;
                case CeilingFan.OFF:
                    ceilingFan.off();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + prevSpeed);
            }
        }
    }
}
