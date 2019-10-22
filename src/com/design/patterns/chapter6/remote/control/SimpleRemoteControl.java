package com.design.patterns.chapter6.remote.control;

import com.design.patterns.chapter6.remote.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
