package com.design.patterns.chapter2.weather.callback;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
