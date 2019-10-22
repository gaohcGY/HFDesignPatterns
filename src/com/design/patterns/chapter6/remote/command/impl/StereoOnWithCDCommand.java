package com.design.patterns.chapter6.remote.command.impl;

import com.design.patterns.chapter6.remote.command.Command;
import com.design.patterns.chapter6.remote.device.Stereo;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        if (stereo != null) {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(12);
        }
    }

    @Override
    public void undo() {
        if (stereo != null) {
            stereo.setDefaultVolume();
            stereo.off();
        }
    }
}
