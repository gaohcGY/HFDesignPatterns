package com.design.patterns.chapter6.remote.command.impl;

import com.design.patterns.chapter6.remote.command.Command;
import com.design.patterns.chapter6.remote.device.CeilingFan;
import com.design.patterns.chapter6.remote.device.Light;

public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        if (ceilingFan != null) {
            ceilingFan.on();
        }
    }

    @Override
    public void undo() {
        if (ceilingFan != null) {
            ceilingFan.off();
        }
    }
}
