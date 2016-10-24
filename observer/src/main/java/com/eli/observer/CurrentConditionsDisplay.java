package com.eli.observer;

import com.eli.condition.DisplayElement;

import java.util.Arrays;

/**
 * Created by pekah on 2016/10/23.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        Arrays.sort();
        System.out.println("The temperature is " + this.temperature + ", the humidity is " + this.humidity);
    }
}
