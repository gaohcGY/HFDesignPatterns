package com.design.patterns.chapter6.remote.command.impl;

import com.design.patterns.chapter6.remote.command.Command;
import com.design.patterns.chapter6.remote.device.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light != null) {
            light.off();
        }
    }

    @Override
    public void undo() {
        if (light != null) {
            light.on();
        }
    }
}
