package com.design.patterns.chapter6.remote.device;

public class Stereo {

    private int volume = 5; // default volume

    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println(location + " Stereo turn off");
    }

    public void on() {
        System.out.println(location + " Stereo turn On");
    }

    public void setCD() {
        System.out.println(location + " Stereo put CD into");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " Stereo volume is :" + this.volume);
    }

    public void setDefaultVolume() {
        if (this.volume != 5) {
            this.volume = 5;
        }
    }
}
