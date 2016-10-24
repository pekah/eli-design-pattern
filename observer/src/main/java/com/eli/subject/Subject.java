package com.eli.subject;

import com.eli.observer.Observer;

/**
 * Created by pekah on 2016/10/23.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
