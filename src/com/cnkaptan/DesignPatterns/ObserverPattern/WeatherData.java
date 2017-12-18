package com.cnkaptan.DesignPatterns.ObserverPattern;

import com.cnkaptan.DesignPatterns.ObserverPattern.observer_interfaces.Observer;
import com.cnkaptan.DesignPatterns.ObserverPattern.observer_interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by cnkaptan on 13/12/15.
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
