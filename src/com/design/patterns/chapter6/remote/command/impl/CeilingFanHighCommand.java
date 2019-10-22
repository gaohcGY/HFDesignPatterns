package com.design.patterns.chapter6.remote.command.impl;

import com.design.patterns.chapter6.remote.command.Command;
import com.design.patterns.chapter6.remote.device.CeilingFan;

import javax.swing.*;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        if (ceilingFan != null) {
            prevSpeed = ceilingFan.getSpeed();
            ceilingFan.high();
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
