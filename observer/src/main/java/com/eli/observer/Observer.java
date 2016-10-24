package com.eli.observer;

/**
 * Created by pekah on 2016/10/23.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
