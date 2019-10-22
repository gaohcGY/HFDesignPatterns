package com.design.patterns.chapter6.remote.command.impl;

import com.design.patterns.chapter6.remote.command.Command;
import com.design.patterns.chapter6.remote.device.GarageDoor;

public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        if (garageDoor != null) {
            garageDoor.down();
        }
    }

    @Override
    public void undo() {
        if (garageDoor != null) {
            garageDoor.up();
        }
    }
}
