package com.design.patterns.chapter2.weather;

import com.design.patterns.chapter2.weather.display.CurrentConditionsDisplay;
import com.design.patterns.chapter2.weather.model.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(85, 60, 31.2f);
        weatherData.setMeasurements(90, 55, 32.3f);
    }
}
