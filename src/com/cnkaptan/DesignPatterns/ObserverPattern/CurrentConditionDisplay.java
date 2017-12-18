package com.cnkaptan.DesignPatterns.ObserverPattern;

import com.cnkaptan.DesignPatterns.ObserverPattern.observer_interfaces.DisplayElement;
import com.cnkaptan.DesignPatterns.ObserverPattern.observer_interfaces.Observer;
import com.cnkaptan.DesignPatterns.ObserverPattern.observer_interfaces.Subject;

/**
 * Created by cnkaptan on 13/12/15.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
