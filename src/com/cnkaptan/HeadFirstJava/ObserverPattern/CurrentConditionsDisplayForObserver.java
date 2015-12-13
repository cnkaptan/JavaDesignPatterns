package com.cnkaptan.HeadFirstJava.ObserverPattern;

import com.cnkaptan.HeadFirstJava.ObserverPattern.observer_interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cnkaptan on 13/12/15.
 */
public class CurrentConditionsDisplayForObserver implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayForObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherSubjectForObservableClass) {
            WeatherSubjectForObservableClass weatherData = (WeatherSubjectForObservableClass) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
