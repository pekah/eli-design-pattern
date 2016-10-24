package com.eli;

import com.eli.observer.CurrentConditionsDisplay;
import com.eli.subject.WeatherData;

/**
 * Created by pekah on 2016/10/23.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.setMeasurements(1 ,2 ,3);
    }
}
