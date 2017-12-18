package com.cnkaptan.DesignPatterns.ObserverPattern.observer_interfaces;

/**
 * Created by cnkaptan on 13/12/15.
 */
public interface Observer {
    void update(float temp,float humidity,float pressure);
}
