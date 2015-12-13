package com.cnkaptan.HeadFirstJava.ObserverPattern.observer_interfaces;



/**
 * Created by cnkaptan on 13/12/15.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
