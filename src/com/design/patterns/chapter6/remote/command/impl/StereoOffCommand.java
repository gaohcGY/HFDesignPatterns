package com.design.patterns.chapter6.remote.command.impl;

import com.design.patterns.chapter6.remote.command.Command;
import com.design.patterns.chapter6.remote.device.Stereo;

public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        if (stereo != null) {
            stereo.off();
        }
    }

    @Override
    public void undo() {
        if (stereo != null) {
            stereo.on();
        }
    }
}
