package com.design.patterns.chapter2.weather.model;

import com.design.patterns.chapter2.weather.callback.Observer;
import com.design.patterns.chapter2.weather.callback.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList<Observer> observers;
    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
//        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i ++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
}
